package day0401;

public class MethodTest05 {
	public static void gugudan(int n) {
		for (int i=1; i<10; i++) {
			System.out.println(n + "*" + i + "=" +n*i);
		}
		System.out.println("");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(1);
		gugudan(3);
		gugudan(5);
	}

}
