package day0329;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("���� N�� �Է��Ͻÿ� : ");
		N = sc.nextInt();
		
		if (N > 0) {
			System.out.println("N�� ���");
		} else if (N == 0) {
			System.out.println("N�� 0");
		} else {
			System.out.println("N�� ����");
		}
	}

}
