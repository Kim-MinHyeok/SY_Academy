package homework;

import java.util.Scanner;

public class Page123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0, guess;
		int randomNumber = (int)(Math.random() * 100)+1;
		
		do {
			System.out.print("정답을 추측해보세요. : ");
			guess = sc.nextInt();
			count+=1;
			
			if(guess > randomNumber) {
				System.out.println("제시한 숫자가 정답보다 높습니다.");
			} else if (guess < randomNumber) {
				System.out.println("제시한 숫자가 정답보다 낮습니다.");
			} else {
				System.out.print("축하합니다.");
				System.out.print(" 시도횟수 = " + count);
				break;
			}
			
			System.out.println("");
		} while(true);

	}

}
