package day0328;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, max, min;
		
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		x = sc.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		y = sc.nextInt();
		
		max = (x>y)?x:y;
		min = (x>y)?y:x;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("�� ���� �� : " + (x+y));
		System.out.println("�� ���� �� : " + (x-y));
		System.out.println("�� ���� �� : " + (x*y));
		System.out.println("�� ���� ��� : " + (x+y)/2);
		System.out.println("ū �� : " + max);
		System.out.println("���� �� : " + min);
		
	}

}