package day0330;

import java.util.Scanner;

public class Page126_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m, temp, result = 0;
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		m = sc.nextInt(); 
		
		for (int j = 1; j <= m; j++) {
			temp = j*j+1;
			result += temp;
			System.out.println(j + "��° ���� �� : " + j + "*" + j + " + 1 = " + temp);
			System.out.println(j + "��° �ױ��� ����� �� : " + result);
			System.out.println(" ");
		}
		System.out.println("��� : " + result);

	}

}