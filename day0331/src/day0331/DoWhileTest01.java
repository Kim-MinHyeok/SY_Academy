package day0331;

import java.util.Scanner;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,i=1,sum = 0;
		
		System.out.print("������ ���ұ��? : ");
		num = sc.nextInt(); 
		
		do {
			sum+=i;
			i++;
		} while (i <= num);

		System.out.print("�հ� : " + sum);
	}

}