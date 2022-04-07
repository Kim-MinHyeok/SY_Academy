package day0405;

class Exam01 {
	public static void plusOne(int n) {
		n = n + 1;
		System.out.println(n);
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 29;
		Exam01.plusOne(age);
		System.out.println(age);
	}

}
