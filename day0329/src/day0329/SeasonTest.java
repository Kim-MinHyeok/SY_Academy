package day0329;

import java.util.Scanner;

public class SeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		String season ="";
		
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		
		if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else {
			season = "1에서 12 사이의 숫자를 입력해주세요";
		}

		System.out.print("현재 계절 : " + season);
	}
}
