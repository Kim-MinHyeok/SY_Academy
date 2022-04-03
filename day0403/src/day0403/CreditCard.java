package day0403;

import java.util.Scanner;

public class CreditCard {
	public static double total(double[] arr) {
		double sum = 0;
		
		for(double i: arr) {
			sum += i;
		}
		
		return sum;
	}

	public static double average(double[] arr) {
		double avg=0;
		
		for(double i: arr) {
			avg += i;
		}
		
		avg = avg/arr.length;
		
		return avg;
	}
	
	public static int max(double[] arr) {
		int max=0;
	
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > arr[i-1]) {
				max = i;
			}
		}
		
		return max+1;
	}
	
	public static int min(double[] arr) {
		int min=0;
	
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < arr[i-1]) {
				min = i;
			}
		}
		
		return min+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] cardUse = new double[12];
		
		for (int i=0; i<cardUse.length;) {
			System.out.print(i+1+"월 카드 사용 금액을 입력하세요 : ");
			cardUse[i] = sc.nextDouble();
			if (cardUse[i] < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			} else {
				i++;
			}
		}
		
		System.out.println("");
		
		System.out.println("1년 동안의 전체 사용 금액 : " + (int)total(cardUse) + "원");
		System.out.println("월별 평균 사용 금액 : " + (int)average(cardUse) + "원");
		System.out.println("가장 지출이 많았던 월 : " + max(cardUse) + "월");
		System.out.println("가장 지출이 적었던 월 : " + min(cardUse) + "월");
	}
}

