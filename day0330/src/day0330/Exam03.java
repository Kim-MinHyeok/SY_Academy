package day0330;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 66;

		// 원문
		if (age > 20)
			if (age < 65)
				System.out.println("1번 그룹");
			else
				System.out.println("2번 그룹");

		// 1번 풀이
		if (age > 20) {
			if (age < 65) {
				System.out.println("1번 그룹");
			}
		} else {
			System.out.println("2번 그룹");
		}

		// 2번 풀이
		if (age > 20)
			if (age < 65)
				System.out.println("1번 그룹");
			else
				System.out.println("2번 그룹");
		
		// 중첩 if문일 때에 else가 오면 가장 가까운 if와 대응이 된다

	}

}
