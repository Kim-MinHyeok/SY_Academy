package day0329;

import java.util.Scanner;

public class DoubleIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
		a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		b = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ� : ");
		c = sc.nextInt();
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		System.out.print("���� ū ���� : " + max);
	}
}
