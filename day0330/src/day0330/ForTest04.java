package day0330;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		int sum = 0;
		
		System.out.print("���� N�� �Է��ϼ��� : ");
		N = sc.nextInt();
		
		
		for (int i = 1 ;i <= N ; i++) {
			if (N % i == 0) {
				System.out.print(i + " ");
			}
		}

		for (int i = 2 ;i < N ; i++) {
			if (N % i == 0) {
				sum += 1;
			}
		}
		
		System.out.println("");
		
		if (sum > 0) {
			System.out.println(N + "�� �Ҽ��� �ƴմϴ�");
		} else

			System.out.println(N + "�� �Ҽ��Դϴ�");
	}

}