package day0328;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int orange,q,r;
		
		System.out.print("�������� ������ �Է��Ͻÿ� : ");
		orange = sc.nextInt();
		
		q = orange/10;
		r = orange%10;
		
		System.out.println(q+ "�ڽ��� �ʿ��ϰ� " +r +"���� �����ϴ�.");
		
	}

}