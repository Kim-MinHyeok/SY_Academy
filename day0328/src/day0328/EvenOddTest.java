package day0328;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String output = "";
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			output = "¦��";
		} else {
			output = "Ȧ��";
		}
		
		System.out.println("���� " + n + "��(��) " + output + "�Դϴ�.");
	}

}
