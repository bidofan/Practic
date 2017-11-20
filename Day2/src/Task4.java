
public class Task4 {
	public void multA(int[][] mA){
        int m = mA.length;
        int n = mA[0].length;
        int[][] res = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    res[i][j] += mA[i][k] * mA[k][j]; 
                }
            }
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
	}
}
}
