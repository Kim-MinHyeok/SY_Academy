package day0329;

import java.util.Scanner;

public class ComparisonOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		
		System.out.print("A�� ���̸� �Է��ϼ��� : ");
		age1 = sc.nextInt();
		System.out.print("B�� ���̸� �Է��ϼ��� : ");
		age2 = sc.nextInt();
		
		if (age1==age2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}
	}

}
