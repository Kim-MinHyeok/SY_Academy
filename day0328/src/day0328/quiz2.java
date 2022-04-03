package day0328;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double mile;
		
		System.out.print("마일을 입력하시오 : ");
		mile = sc.nextDouble();
		
		System.out.println(mile + "마일은 " +(mile*1.609)+ "킬로미터입니다.");
		
	}

}
