package day0403;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		
		for (int i=0; i<array.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			array[i] = scan.nextInt();
		}

		System.out.println("");
		
		for (int i: array) {
			System.out.println(i);
		}

		System.out.println("");
		
		for (int i=array.length-1; i>-1; i--) {
			System.out.println(array[i]);
		}
	}

}
