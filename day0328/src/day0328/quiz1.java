package day0328;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int orange,q,r;
		
		System.out.print("오렌지의 개수를 입력하시오 : ");
		orange = sc.nextInt();
		
		q = orange/10;
		r = orange%10;
		
		System.out.println(q+ "박스가 필요하고 " +r +"개가 남습니다.");
		
	}

}
