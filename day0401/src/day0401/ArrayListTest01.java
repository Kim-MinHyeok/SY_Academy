package day0401;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = 0, sum = 0, cnt = 0;
		
		ArrayList<Integer> n = new ArrayList<Integer>();

		do {
			System.out.print("성적을 입력하세요 : ");
			score = sc.nextInt();

			if (score == -1) {
				break;
			}

			n.add(score);
		} while(true);

		cnt = n.size();
		
		for (int a : n) {
			sum += a;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ((double)sum / cnt));

	}

}
