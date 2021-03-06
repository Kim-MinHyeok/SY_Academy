package day0403;

import java.util.Scanner;

public class Exam {
	static char[] answer = {'a', 'c', 'd', 'b', 'c', 'a', 'a', 'd', 'b', 'b'};
	
	public static boolean isPassed(char[] studentAnswer) {
		boolean passed = false;
		
		int correct = correctAnswers(studentAnswer);
		
		if (correct > 7) {
			passed = true;
		}
		
		return passed;
	}
	
	public static int correctAnswers(char[] studentAnswer) {
		int correct = 0;
		
		for (int i=0; i<answer.length; i++) {
			if (answer[i] == studentAnswer[i]) {
				correct += 1;
			}
		}
		
		return correct;
	}

	public static int incorrectAnswers(char[] studentAnswer) {
		int incorrect = 10 - correctAnswers(studentAnswer);
		
		return incorrect;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] studentAnswer = new char[10];
		
		for (int i=0; i<studentAnswer.length; i++) {
			System.out.print(i+1+"번 정답 : ");
			studentAnswer[i] = sc.next().charAt(0);
		}
		
		System.out.println("");
		
		if (isPassed(studentAnswer)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("정답 횟수 : " + correctAnswers(studentAnswer));
		System.out.println("오답 횟수 : " + incorrectAnswers(studentAnswer));
	}
}
