package homework;

import java.util.Scanner;

public class Page123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0, guess;
		int randomNumber = (int)(Math.random() * 100)+1;
		
		do {
			System.out.print("������ �����غ�����. : ");
			guess = sc.nextInt();
			count+=1;
			
			if(guess > randomNumber) {
				System.out.println("������ ���ڰ� ���亸�� �����ϴ�.");
			} else if (guess < randomNumber) {
				System.out.println("������ ���ڰ� ���亸�� �����ϴ�.");
			} else {
				System.out.print("�����մϴ�.");
				System.out.print(" �õ�Ƚ�� = " + count);
				break;
			}
			
			System.out.println("");
		} while(true);

	}

}