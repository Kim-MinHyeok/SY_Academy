package day0329;

import java.util.Scanner;

public class BooleanTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		boolean bool;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		bool = age >=20;
		
		System.out.println(bool);
	}
}
