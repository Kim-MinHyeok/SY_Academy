package day0329;

import java.util.Scanner;

public class ComparisonOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		
		System.out.print("A의 나이를 입력하세요 : ");
		age1 = sc.nextInt();
		System.out.print("B의 나이를 입력하세요 : ");
		age2 = sc.nextInt();
		
		if (age1==age2) {
			System.out.println("동갑");
		} else {
			System.out.println("다름");
		}
	}

}
