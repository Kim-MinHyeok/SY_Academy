package day0401;

public class MethodTest06 {
	public static void comparison (int a, int b) {
		System.out.print(a+"��(��) "+b +"�߿��� ");
		if(a > b) {
			System.out.print(a + "��(��) �� ũ��");
		} else {
			System.out.print(b + "��(��) �� ũ��");
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
