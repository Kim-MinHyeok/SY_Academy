package day0403;

import java.util.Iterator;
import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];
		int[] count2 = new int[26];
		
		System.out.print("문자열을 입력하세요 : ");
		String buffer = scan.nextLine();
		
		for (int i=0; i<buffer.length(); i++) {
			char ch = buffer.charAt(i);
			if(ch < 97) {
				count2[ch-'A']++;
			} else {
				count[ch-'a']++;
			}
		}
		
		for (int i: count) {
			System.out.print(i);
		}
		
		System.out.println("");
		
		for (int i: count2) {
			System.out.print(i);
		}

	}

}
