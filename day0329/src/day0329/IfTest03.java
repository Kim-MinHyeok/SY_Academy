package day0329;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("숫자 N을 입력하시오 : ");
		N = sc.nextInt();
		
		if (N > 0) {
			System.out.println("N은 양수");
		} else if (N == 0) {
			System.out.println("N은 0");
		} else {
			System.out.println("N은 음수");
		}
	}

}
