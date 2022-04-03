package day0330;

import java.util.Scanner;

public class DoubleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col;
		
		System.out.print("줄 수를 입력하세요 : ");
		row = sc.nextInt(); 
		
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
