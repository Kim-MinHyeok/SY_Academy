package day0331;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dan, i=1;
		
		System.out.println("�� ���� �Է��ϼ��� : ");
		dan = sc.nextInt();
		
		while (i<=9) {
			System.out.println(dan + "*" + i +"=" + dan*i);
			i++;
		}

	}

}