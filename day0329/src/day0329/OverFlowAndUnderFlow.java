package day0329;

public class OverFlowAndUnderFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127;
		a = (byte) (a+1);
		System.out.println(a);
		
		byte b = -128;
		b = (byte)(b-1);
		System.out.println(b);

	}

}
