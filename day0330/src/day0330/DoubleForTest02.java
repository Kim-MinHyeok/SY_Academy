package day0330;

import java.util.Scanner;

public class DoubleForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		row = sc.nextInt(); 
		System.out.print("�� ���� �Է��ϼ��� : ");
		col = sc.nextInt(); 
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}