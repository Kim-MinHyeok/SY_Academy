package day0401;

public class MaxTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {-9,-8,-5,-15,-7};
		
		int max = data[0];
		
		for (int a=1; a < data.length; a++) {
			if (data[a] > max) {
				max = data[a];
			}
		}
		
		System.out.println(max);
	}

}
