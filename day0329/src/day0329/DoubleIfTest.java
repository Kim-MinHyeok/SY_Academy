package day0329;

import java.util.Scanner;

public class DoubleIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.print("첫번째 숫자를 입력하시오 : ");
		a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		b = sc.nextInt();
		System.out.print("세번째 숫자를 입력하시오 : ");
		c = sc.nextInt();
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if (b > c) {
				max = b;
			} else {
				max = c;
			}
		}

		System.out.print("가장 큰 숫자 : " + max);
	}
}
