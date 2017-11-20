import java.util.Scanner;

public class Task3 {
	public int a, b ,c;
	 public void matrixProjection(int[][][] matr) {
		 for(int i = 0; i < a; i++) {
			 for(int j = 0; j < b; j++) {
				System.out.println(matr[i][j][c]); 
			 }
		 }
		 System.out.println("Projection 2");
		 for(int i = 0; i < a; i++) {
			 for(int j = 0; j < c; j++) {
				System.out.println(matr[i][b][j]); 
			 }
		 }
		 System.out.println("Projection 3");
		 for(int i = 0; i < b; i++) {
			 for(int j = 0; j < c; j++) {
				System.out.println(matr[a][i][j]); 
			 }
		 }
	 }

	public int[][][] fillMart(int l, int t,  int s) {
		int matr[][][] = new int[l][t][s];
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < t; j++) {
				for(int k = 0; k < s; k++) {
				matr[i][j][k] = ((int)(Math.random() * 20) - 5);
				}
			}
		}
		return matr;
	}
}

