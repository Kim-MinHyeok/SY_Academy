package day0328;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if (age >= 10 && age <= 19) {
			System.out.println("10대입니다.");
		} else {
			System.out.println("10대가 아닙니다.");
		}
	}

}
