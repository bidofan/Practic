public class Task2 {
	int m, n;
	public void tansoformToArray(int m, int n) {
		int  counter = 0;
		System.out.println("Write number of rows and columns of matrix A: ");
		int A[][] = new int[m][n];
		int B[] = new int[m*n];
		System.out.println("Matrix A:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				A[i][j] = ((int)(Math.random() * 20) - 5);;
				B[counter] = A[i][j];
				System.out.print(A[i][j] + " ");
				counter++;
			}
			System.out.println();
		}
		for(int i = 0; i < m*n; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
	}
}
