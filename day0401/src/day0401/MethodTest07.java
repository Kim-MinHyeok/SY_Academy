package day0401;

public class MethodTest07 {
	public static int sum (int n) {
		int r=0;
		for (int i=0; i<=n; i++) {
			r +=i;
		}
		
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		System.out.println(sum(1));
		
		a = sum(3);
		System.out.println(a);
		
		a = sum(5);
		System.out.println(a);
	}

}
