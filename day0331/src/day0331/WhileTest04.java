package day0331;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row, col,i=1,j=1;
		
		System.out.print("�� ���� �Է��ϼ��� : ");
		row = sc.nextInt(); 
		System.out.print("�� ���� �Է��ϼ��� : ");
		col = sc.nextInt(); 
		
		while (i <= row) {
			while (j <= col) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
			j=1;
		}

	}

}
