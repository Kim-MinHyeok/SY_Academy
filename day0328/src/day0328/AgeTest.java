package day0328;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		if (age >= 10 && age <= 19) {
			System.out.println("10���Դϴ�.");
		} else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
	}

}
