package day0403;

import java.util.Scanner;

public class Homework {
	static void init(double[] values) {					// exercise 6
		for (int i=0; i<values.length; i++) {
			values[i] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		int[] studentNumbers = new int[30];				// exercise 1
		double[] profits = new double[100];
		char[] proverbs = new char[2000];
		double[] doubleArray = {1.2, 3.2, 6.7};
		
		
		
//		int[] numbers = new numbers[100];				// exercise 2
		int[] numbers = new int[100];
//		double rainfalls[100] = new double();
		double[] rainfalls = new double[100];
		
		
		
		int[] employees = new int[5];					// exercise 3
//		유효 인덱스 범위 = 0 ~ 4;
//		인덱스 5 접근시 배열범위초과 오류 발생
		
		
		
		int[] numbers2 = new int[5];					// exercise 4
		for (int i=0; i<5; i++) {
			numbers2[i] = i+1;
		}
		for (int i: numbers2) {
			System.out.println(i);
		}
		System.out.println("");
//		for (int i: numbers2) {
//			System.out.println(numbers2[i]);
//		}
		
		
				
		int size;
		System.out.print("배열의 크기를 입력하세요 : ");		// exercise 5
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("");
		
		
		
		double[] asd = {1.3, 5.5, 9.1, 3.7};			// exercise 6
		for(double a: asd) {
			System.out.println(a);
		}
		System.out.println("");
		
		init(asd);
		
		for(double a: asd) {
			System.out.println(a);
		}
		System.out.println("");
		
		
		
		int[][][] shelf = new int[60][10][30];			// exercise 7
		for(int i=0; i<shelf.length; i++) {
			for(int j=0; j<shelf[i].length; j++) {
				for(int k=0; k<shelf[i][j].length; k++) {
					shelf[i][j][k] = 0;
				}
			}
		}
//		for(int i=0; i<shelf.length; i++) {
//			for(int j=0; j<shelf[i].length; j++) {
//				for(int k=0; k<shelf[i][j].length; k++) {
//					System.out.print(shelf[i][j][k] + " ");
//				}
//				System.out.println("");
//			}
//			System.out.println("");
//		}
		
		
		
		int[] a = {1, 2, 3, 4, 5};						// exercise 8
		int[] b = new int[5];
		b = a;
		for (int i: b) {
			System.out.println(i);
		}
		for (int i=0; i<b.length; i++) {
			b[i] = a[i];
		}
		
		
		
		boolean same = false;							// exercise 9
		int cnt = 0;
		int[] c = {1, 2, 3, 4, 5};
		int[] d = {1, 2, 3, 4, 5};
		
		if(c.length != d.length) {
			same = false;
		} else {
			for (int i=0; i < c.length; i++) {
				for(int j=0; j < c.length; j++) {
					if (c[i] == d[j]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt == c.length) {
				same = true;
			}
		}
	}

}
