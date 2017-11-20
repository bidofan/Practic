import java.util.Arrays;

public class Task1 {
	//Method for deleting the same elements in array
	public void delSamSymbols(int[] values) {
		boolean mask[] = new boolean[values.length];
		int removeCount = 0;

		for (int i = 0; i < values.length; i++) {
			if (!mask[i]) {
				int tmp = values[i];

				for (int j = i + 1; j < values.length; j++) {
					if (tmp == values[j]) {
						mask[j] = true;
						removeCount++;
					}
				}
			}
		}

		int[] result = new int[values.length - removeCount];

		for (int i = 0, j = 0; i < values.length; i++) {
			if (!mask[i]) {
				result[j++] = values[i];
			}
		}
		System.out.println(Arrays.toString(result));

	}
}
