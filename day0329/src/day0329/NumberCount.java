package day0329;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("숫자 N을 입력하시오 : ");
		N = sc.nextInt();
		
		if (N >= 1 && N <= 9) {
			if (N == 1) {
				System.out.println("ONE");
			} else if (N == 2) {
				System.out.println("TWO");
			} else if (N == 3) {
				System.out.println("THREE");
			} else if (N == 4) {
				System.out.println("FOUR");
			} else if (N == 5) {
				System.out.println("FIVE");
			} else if (N == 6) {
				System.out.println("SIX");
			} else if (N == 7) {
				System.out.println("SEVEN");
			} else if (N == 8) {
				System.out.println("EIGHT");
			} else if (N == 9) {
				System.out.println("NINE");
			}
			
		} else {
			System.out.println("OTHER");
		}
	}

}
