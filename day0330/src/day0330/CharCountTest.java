package day0330;

import java.util.Scanner;

public class CharCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int cnt = 0;
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.next();
		
		for (int i = 0 ;i < str.length() ;i++) {
			if (str.charAt(i) == 'a') {
				cnt += 1;
			}
		}
	
		System.out.println("a의 개수 : " + cnt);
	}

}
