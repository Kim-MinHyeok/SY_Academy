package day0328;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int math, kor, eng, avg, sum;
		
		System.out.print("학생의 이름을 입력하시오 : ");
		name = sc.next();
		System.out.print("국어 점수를 입력하시오 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		math = sc.nextInt();
		
		sum = math + kor + eng;
		avg = sum/3;

		String result = "";
		if (avg >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}

		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("결과 : " + result);
	}

}
