package day0331;

import java.util.Scanner;

public class Page129_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		double sum=0, max = arr[0];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(" ");
		System.out.println("?? = " + sum);
		System.out.println("?ִ? = " + max);

	}

}
