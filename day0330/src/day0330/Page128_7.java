package day0330;

public class Page128_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeNumber, temp = 0;
		
		System.out.println("2���� 100 ������ ��� �Ҽ� : ");
		
		for (int i = 2; i <=100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					temp += 1;
				}
			}
			if (temp == 2) {
				System.out.println(i+ " ");
			}
			temp = 0;
		}

	}

}
