package day0328;

import java.util.Date;
import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		
		int year = today.getYear()+1900;
		int month = today.getMonth()+1;
		int day = today.getDate();
		int hour = today.getHours();
		int minute = today.getMinutes();
		int second = today.getSeconds();
		
		System.out.print(year + "년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
	}

}
