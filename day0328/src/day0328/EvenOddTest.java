package day0328;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String output = "";
		
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			output = "짝수";
		} else {
			output = "홀수";
		}
		
		System.out.println("숫자 " + n + "은(는) " + output + "입니다.");
	}

}
