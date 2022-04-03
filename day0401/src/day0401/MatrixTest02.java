package day0401;

public class MatrixTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][5];
		int[] sum = new int[5];

		int n = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==4) {
					a[i][j] = sum[i];
				} else {
					a[i][j] = n++;
					sum[i] += a[i][j];
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

}
