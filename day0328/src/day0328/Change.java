package day0328;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pay,price;

		System.out.print("���� ���� �Է��ϼ��� : ");
		pay = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		price = sc.nextInt();
		
		System.out.println("���� �� : " + pay);
		System.out.println("��ǰ ���� : " + price);
		System.out.println("�ΰ��� : " + price/10);
		System.out.println("�ܵ� : " + (pay - price));

	}

}
