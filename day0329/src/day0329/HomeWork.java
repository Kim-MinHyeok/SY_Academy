package day0329;

import java.util.Scanner;

public class HomeWork {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int number, temp;
		String korNumber = "";
		
		System.out.print("0~99 ������ ���ڸ� �Է��ϼ��� : ");
		number = sc.nextInt();
		
		if (number / 10 == 1) {
			korNumber += "��"; 
		} else if (number / 10 == 2) {
			korNumber += "�̽�"; 
		} else if (number / 10 == 3) {
			korNumber += "���"; 
		} else if (number / 10 == 4) {
			korNumber += "���"; 
		} else if (number / 10 == 5) {
			korNumber += "����"; 
		} else if (number / 10 == 6) {
			korNumber += "����"; 
		} else if (number / 10 == 7) {
			korNumber += "ĥ��"; 
		} else if (number / 10 == 8) {
			korNumber += "�Ƚ�"; 
		} else if (number / 10 == 9) {
			korNumber += "����"; 
		}

		temp = number - (number / 10)*10;
		
		if (temp == 1) {
			korNumber += "��"; 
		} else if (temp == 2) {
			korNumber += "��"; 
		} else if (temp == 3) {
			korNumber += "��"; 
		} else if (temp == 4) {
			korNumber += "��"; 
		} else if (temp == 5) {
			korNumber += "��"; 
		} else if (temp == 6) {
			korNumber += "��"; 
		} else if (temp == 7) {
			korNumber += "ĥ"; 
		} else if (temp == 8) {
			korNumber += "��"; 
		} else if (temp == 9) {
			korNumber += "��"; 
		}
		
		System.out.println(korNumber);
	}
}