package day0401;

public class MethodTest06 {
	public static void comparison (int a, int b) {
		System.out.print(a+"와(과) "+b +"중에서 ");
		if(a > b) {
			System.out.print(a + "이(가) 더 크다");
		} else {
			System.out.print(b + "이(가) 더 크다");
		}
		
		System.out.println("");
		
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparison(1,3);
		comparison(3,2);
		comparison(5,9);
	}

}
