package day0330;

import java.util.Scanner;

public class SwitchTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch (month) {
			case 2:
				System.out.println("28");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30");
				break;
			default:
				System.out.println("31");
					
		}

	}

}
