package day0328;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pay,price;

		System.out.print("받을 돈을 입력하세요 : ");
		pay = sc.nextInt();
		System.out.print("물건 가격을 입력하세요 : ");
		price = sc.nextInt();
		
		System.out.println("받은 돈 : " + pay);
		System.out.println("상품 가격 : " + price);
		System.out.println("부가세 : " + price/10);
		System.out.println("잔돈 : " + (pay - price));

	}

}
