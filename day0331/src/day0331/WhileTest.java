package day0331;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N, i=0, sum=0;
		
		System.out.print("정수 N을 입력하세요 : ");
		N = sc.nextInt();
		
		while (i<N) {
			System.out.print(N-i);
			sum +=N-i;
			
			if (N-i == 1) {
				System.out.print("");
			} else {
				System.out.print("*");
			}
			i++;
		}
		
		System.out.print(" = " + sum);

	}

}
