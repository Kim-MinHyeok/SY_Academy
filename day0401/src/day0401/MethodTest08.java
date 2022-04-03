package day0401;

public class MethodTest08 {
	public static int comparison (int a, int b) {
		int r;
		if(a > b) {
			r = a;
		} else {
			r = b;
		}
		
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		a = comparison(1,3);
		System.out.println(a);
		
		a = comparison(3,2);
		System.out.println(a);
		
		a = comparison(5,9);
		System.out.println(a);
	}

}
