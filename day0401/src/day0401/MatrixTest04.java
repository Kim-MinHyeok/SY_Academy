package day0401;

public class MatrixTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[5][5];
		int[] rowSum = new int[5];
		int[] colSum = new int[5];
		int sum = 0;

		int n = 1;

		for (int i = 0; i < 4; i++) {
			if (i == 4) {
				for (int j = 0; j < 4; j++) {
					matrix[4][j] = colSum[j];
				}
			} else {
				for (int j = 0; j < 5; j++) {
					if (j == 4) {
						matrix[i][j] = rowSum[i];
					} else {
						matrix[i][j] = n++;
						rowSum[i] += matrix[i][j];
					}
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				colSum[i] +=  matrix[j][i];
				sum += matrix[i][j];
			}
		}

		for (int i = 0; i < 5; i++) {
			matrix[4][i] = colSum[i];
		}

		matrix[4][4] = sum;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

}
