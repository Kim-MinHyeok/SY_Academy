package day0330;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		int sum = 0;
		int odd = 0;
		int even = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		System.out.print("정수 N을 입력하세요 : ");
		N = sc.nextInt();
		
		for (int i = 1 ;i <= N ; i++) {
			if (i%2 == 0) {
				even +=1;
				evenSum += i;
			} else {
				odd +=1;
				oddSum += i;
			}
		}
		
		System.out.println("짝수의 개수 : " + even);
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("홀수의 합 : " + oddSum);
	}

}
