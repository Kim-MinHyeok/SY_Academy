package day0330;

import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, star="";
		int month, date;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		month = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		date = sc.nextInt();

		switch (month) {
			case 1:
				star = (date <= 19) ? "�����ڸ�" : "�����ڸ�";
				break;
			case 2:
				star = (date <= 18) ? "�����ڸ�" : "������ڸ�";
				break;
			case 3:
				star = (date <= 20) ? "������ڸ�" : "���ڸ�";
				break;
			case 4:
				star = (date <= 19) ? "���ڸ�" : "Ȳ���ڸ�";
				break;
			case 5:
				star = (date <= 20) ? "Ȳ���ڸ�" : "�ֵ����ڸ�";
				break;
			case 6:
				star = (date <= 21) ? "�ֵ����ڸ�" : "���ڸ�";
				break;
			case 7:
				star = (date <= 22) ? "���ڸ�" : "�����ڸ�";
				break;
			case 8:
				star = (date <= 22) ? "�����ڸ�" : "ó���ڸ�";
				break;
			case 9:
				star = (date <= 23) ? "ó���ڸ�" : "õĪ�ڸ�";
				break;
			case 10:
				star = (date <= 22) ? "õĪ�ڸ�" : "�����ڸ�";
				break;
			case 11:
				star = (date <= 22) ? "�����ڸ�" : "����ڸ�";
				break;
			case 12:
				star = (date <= 24) ? "����ڸ�" : "�����ڸ�";
				break;
		}

		System.out.print(name + "���� ���ڸ��� " + star +"�Դϴ�.");

	}

}
