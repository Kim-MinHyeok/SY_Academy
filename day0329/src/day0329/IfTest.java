package day0329;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.print("숫자 N을 입력하시오 : ");
		N = sc.nextInt();
		
		if (N >= 0) {
			N +=100;
			System.out.println("N : " + N);
			System.out.println("작업종료");
		} else {
			N *=N;
			System.out.println("N : " + N);
			System.out.println("작업종료");
		}
	}

}
