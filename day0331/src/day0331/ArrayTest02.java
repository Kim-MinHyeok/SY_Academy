package day0331;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < age.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			age[i] = sc.nextInt();
		}
		
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}

		avg = ((double)sum)/age.length;
		
		System.out.println("총 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
	}

}
