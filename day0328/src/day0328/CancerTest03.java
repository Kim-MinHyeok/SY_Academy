package day0328;

import java.util.Date;
import java.util.Scanner;

public class CancerTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int year;
		String name;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("출생 연도를 입력하세요 : ");
		year = sc.nextInt();

		System.out.println("");
		System.out.println("*** 결과 확인 ***");
		System.out.println("이변연도 : " + thisYear);
		System.out.println("출생연도 : " + year);
		System.out.println("나이 : " + (thisYear - year));
		
		if (year%2 == thisYear%2 && 2022-year >= 40) {
			System.out.println(name + "님은 무료 암검진 대상자입니다.");
		} else {
			System.out.println(name + "님은 무료 암검진 대상자가 아닙니다.");
			
		}
	}

}
