package day0331;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		Random r = new Random();
		
		for (int i = 0; i < lotto.length;) {
			int n = r.nextInt(45) + 1;
			int k;
			
			for (k = 0; k < i; k++) {
				if (n == lotto[k]) {
					break;
				} 
			}
			
			if (i == k) {
				lotto[i] = n;
				i++;
			}
			
		}
		
		
		System.out.println("");
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i+1) +"번째 번호 : " + lotto[i]);
		}

	}

}
