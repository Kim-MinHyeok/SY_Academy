package day0331;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {28, 27, 27, 25, 26};
		int sum = 0;
		
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		
		System.out.println("��� ���� : " + sum/age.length);
	}

}
