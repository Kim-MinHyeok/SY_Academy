package day0330;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		int sum = 1;
		
		System.out.print("정수 N을 입력하세요 : ");
		N = sc.nextInt();
		
		
		for (int i = N ;i >= 1 ; i--) {
			sum = sum*i;
			if (i == 1) {
				System.out.print(i + "="+sum);
			} else {
				System.out.print(i + "*");
			}
		}
	}

}
