package day0331;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		
		
		while (i<=9) {
			while (j<=9) {
				System.out.println(i + "*" + j +"=" + j*i);
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}

	}

}
