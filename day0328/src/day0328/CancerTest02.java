package day0328;

import java.util.Scanner;

public class CancerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		int thisYear = 2022;
		String name;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.print("��� ������ �Է��ϼ��� : ");
		year = sc.nextInt();

		System.out.println("");
		System.out.println("*** ��� Ȯ�� ***");
		System.out.println("�̺����� : " + thisYear);
		System.out.println("������� : " + year);
		System.out.println("���� : " + (thisYear - year));
		System.out.println("");
		
		if (year%2 == thisYear%2 && 2022-year >= 40) {
			System.out.println(name + "���� ���� �ϰ��� ������Դϴ�.");
		} else {
			System.out.println(name + "���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
			
		}
	}

}