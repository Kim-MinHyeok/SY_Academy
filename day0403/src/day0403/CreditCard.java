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
			System.out.print(i+1+"�� ī�� ��� �ݾ��� �Է��ϼ��� : ");
			cardUse[i] = sc.nextDouble();
			if (cardUse[i] < 0) {
				System.out.println("������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				i++;
			}
		}
		
		System.out.println("");
		
		System.out.println("1�� ������ ��ü ��� �ݾ� : " + (int)total(cardUse) + "��");
		System.out.println("���� ��� ��� �ݾ� : " + (int)average(cardUse) + "��");
		System.out.println("���� ������ ���Ҵ� �� : " + max(cardUse) + "��");
		System.out.println("���� ������ ������ �� : " + min(cardUse) + "��");
	}
}

