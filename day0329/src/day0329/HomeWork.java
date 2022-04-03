package day0329;

import java.util.Scanner;

public class HomeWork {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int number, temp;
		String korNumber = "";
		
		System.out.print("0~99 »çÀÌÀÇ ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		number = sc.nextInt();
		
		if (number / 10 == 1) {
			korNumber += "½Ê"; 
		} else if (number / 10 == 2) {
			korNumber += "ÀÌ½Ê"; 
		} else if (number / 10 == 3) {
			korNumber += "»ï½Ê"; 
		} else if (number / 10 == 4) {
			korNumber += "»ç½Ê"; 
		} else if (number / 10 == 5) {
			korNumber += "¿À½Ê"; 
		} else if (number / 10 == 6) {
			korNumber += "À°½Ê"; 
		} else if (number / 10 == 7) {
			korNumber += "Ä¥½Ê"; 
		} else if (number / 10 == 8) {
			korNumber += "ÆÈ½Ê"; 
		} else if (number / 10 == 9) {
			korNumber += "±¸½Ê"; 
		}

		temp = number - (number / 10)*10;
		
		if (temp == 1) {
			korNumber += "ÀÏ"; 
		} else if (temp == 2) {
			korNumber += "ÀÌ"; 
		} else if (temp == 3) {
			korNumber += "»ï"; 
		} else if (temp == 4) {
			korNumber += "»ç"; 
		} else if (temp == 5) {
			korNumber += "¿À"; 
		} else if (temp == 6) {
			korNumber += "À°"; 
		} else if (temp == 7) {
			korNumber += "Ä¥"; 
		} else if (temp == 8) {
			korNumber += "ÆÈ"; 
		} else if (temp == 9) {
			korNumber += "±¸"; 
		}
		
		System.out.println(korNumber);
	}
}