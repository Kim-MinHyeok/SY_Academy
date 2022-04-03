package day0331;

import java.util.Random;
import java.util.Scanner;

public class AutoLottoSort {

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
		
		int temp;
		
		for (int i=0; i<lotto.length;i++) {

			System.out.print("[");
			
			for (int k=0; k<lotto.length;k++) {
				if(k == lotto.length-1) {
					System.out.print(lotto[k]);
				} else {
					System.out.print(lotto[k]+",");
				}
			}
			
			System.out.print("]");
			
			for (int j=i+1; j<lotto.length;j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
 			}
			
			System.out.println("");
		}

	}

}
