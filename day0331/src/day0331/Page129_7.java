package day0331;

public class Page129_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeNumber, temp = 0;
		int i = 2;
		int j = 1;
		
		System.out.print("2부터 100 사이의 모든 소수 : ");
		
		do {
			do{
				if (i%j == 0) {
					temp += 1;
				}
				j++;
			} while  ( j <= i) ;
			
			if (temp == 2) {
				System.out.print(i+ " ");
			}
			
			temp = 0;
			j = 1;
			i++;
		} while ( i <=100);

	}

}
