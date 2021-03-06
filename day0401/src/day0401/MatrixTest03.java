package day0401;

public class MatrixTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[5][5];
		int[] colsum;
		int n = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = n++;
				matrix[4][j] += matrix[i][j];
				matrix[i][4] += matrix[i][j];
				matrix[4][4] += matrix[i][j];
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

}
