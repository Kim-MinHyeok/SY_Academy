package day0328;

import java.util.Scanner;

public class CancerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, check;
		int age;

		System.out.print("성함을 입력하세요 : ");
		name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if (age >= 40) {
			check = "대상자";
		} else {
			check = "비대상자";
		}

		System.out.print(name + "님은 무료 암검진" + check + "입니다.");
		
	}

}
