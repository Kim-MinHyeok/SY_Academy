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
			System.out.print(i+1 + "�� ������ ������ �Է��ϼ��� : ");
			userAnswer[i] = sc.nextInt();
			
			answer[i] = r.nextInt(4) + 1;
			
			if(answer[i] == userAnswer[i]) {
				correct +=1;
			}
		}
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤ� ���� ��� �ѤѤѤѤѤѤѤѤѤ�");
		
		System.out.print("���� : ");
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
		System.out.println("����� : "+correct);
		System.out.println("Ʋ���� : "+(10-correct));
	}

}
