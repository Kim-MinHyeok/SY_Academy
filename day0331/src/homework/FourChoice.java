package homework;

import java.util.Random;
import java.util.Scanner;

public class FourChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[10];
		int[] userAnswer = new int[10];
		int n = 0, correct = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		System.out.println();
		for (int i = 0; i < answer.length; i++) {
			System.out.print(i+1 + "번 문제의 정답을 입력하세요 : ");
			userAnswer[i] = sc.nextInt();
			
			answer[i] = r.nextInt(4) + 1;
			
			if(answer[i] == userAnswer[i]) {
				correct +=1;
			}
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 성적 결과 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.print("정답 : ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		System.out.println();
		for (int i = 0; i < answer.length; i++) {
			System.out.print(i+1+"  ");
		}
		System.out.println();
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] == userAnswer[i]) {
				System.out.print("O  ");
			} else {
				System.out.print("X  ");
			}
		}

		System.out.println();
		System.out.println("정답수 : "+correct);
		System.out.println("틀린수 : "+(10-correct));
	}

}
