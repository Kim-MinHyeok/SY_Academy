package day0329;

import java.util.Scanner;

public class SeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		String season ="";
		
		System.out.print("���� �Է��ϼ��� : ");
		month = sc.nextInt();
		
		if (month == 3 || month == 4 || month == 5) {
			season = "��";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "����";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "����";
		} else if (month == 12 || month == 1 || month == 2) {
			season = "�ܿ�";
		} else {
			season = "1���� 12 ������ ���ڸ� �Է����ּ���";
		}

		System.out.print("���� ���� : " + season);
	}
}