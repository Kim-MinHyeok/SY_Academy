package day0330;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.print("정수 N을 입력하세요 : ");
		N = sc.nextInt();
		
		for (int i = 1 ;i <= N ; i++) {
			System.out.println(i);
		}
	}

}
