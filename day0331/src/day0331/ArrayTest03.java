package day0331;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print("번호를 입력하세요 : ");
			lotto[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i+1) +"번째 번호 : " + lotto[i]);
		}

	}

}
