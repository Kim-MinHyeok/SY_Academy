package day0328;

import java.util.Scanner;

public class CircleVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double radius, volume;
		Double pie = 3.14;

		System.out.print("반지름을 입력하세요 : ");
		radius = sc.nextDouble();
		
		volume = radius*radius*radius*pie*4.0/3.0;
		
		System.out.println("구의 반지름 : " + radius);
		System.out.println("구의 부피 : " + volume);

	}

}
