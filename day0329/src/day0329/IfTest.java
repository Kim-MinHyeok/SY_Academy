package day0329;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("���� N�� �Է��Ͻÿ� : ");
		N = sc.nextInt();
		
		if (N >= 0) {
			N +=100;
			System.out.println("N : " + N);
			System.out.println("�۾�����");
		} else {
			N *=N;
			System.out.println("N : " + N);
			System.out.println("�۾�����");
		}
	}

}
