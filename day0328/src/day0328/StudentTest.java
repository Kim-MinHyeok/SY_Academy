package day0328;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int math, kor, eng, avg, sum;
		
		System.out.print("�л��� �̸��� �Է��Ͻÿ� : ");
		name = sc.next();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		math = sc.nextInt();
		
		sum = math + kor + eng;
		avg = sum/3;

		String result = "";
		if (avg >= 60) {
			result = "�հ�";
		} else {
			result = "���հ�";
		}

		System.out.println("*** ���� ó�� ��� ***");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("��� : " + result);
	}

}
