package day0328;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, max, min;
		
		System.out.print("첫번째 정수를 입력하시오 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		y = sc.nextInt();
		
		max = (x>y)?x:y;
		min = (x>y)?y:x;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("두 수의 합 : " + (x+y));
		System.out.println("두 수의 차 : " + (x-y));
		System.out.println("두 수의 곱 : " + (x*y));
		System.out.println("두 수의 평균 : " + (x+y)/2);
		System.out.println("큰 수 : " + max);
		System.out.println("작은 수 : " + min);
		
	}

}
