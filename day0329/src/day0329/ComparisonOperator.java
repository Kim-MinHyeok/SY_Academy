package day0329;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if (age>=20) {
			System.out.println("입장 가능");
		} else {
			System.out.println("입장 불가");
		}
	}

}
