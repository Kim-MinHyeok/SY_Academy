package day0331;

import java.util.Scanner;

public class Page129_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 항의 개수 : ");
		num = sc.nextInt();
		
		int[] fib = new int[num];
		fib[0] = 0;
		fib[1] = 1;

		for (int i=2; i<num; i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		
		for (int i=0; i<num; i++) {
			System.out.print(fib[i] + " ");
		}

	}

}
