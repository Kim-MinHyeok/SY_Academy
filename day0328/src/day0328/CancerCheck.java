package day0328;

import java.util.Scanner;

public class CancerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, check;
		int age;

		System.out.print("������ �Է��ϼ��� : ");
		name = sc.next();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		if (age >= 40) {
			check = "�����";
		} else {
			check = "������";
		}

		System.out.print(name + "���� ���� �ϰ���" + check + "�Դϴ�.");
		
	}

}