import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringLastnames {

	public static void main(String[] args) {
		String inputString;
		Scanner sc = new Scanner(System.in);
		inputString = sc.nextLine();
		String digitStr = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isDigit(inputString.charAt(i))) {
				digitStr += inputString.charAt(i);
			}
	}
	int num = Integer.parseInt(digitStr);
	System.out.println(num);
	}
}
