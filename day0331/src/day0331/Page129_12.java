package day0331;

import java.util.Scanner;

public class Page129_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score=0, sum=0, cnt=0;
		
		while(score != -1) {
			System.out.print("성적을 입력하세요 : ");
			score = sc.nextInt();
			
			if(score == -1) {
				break;
			}
			
			cnt++;
			sum +=score;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/cnt);

	}

}
