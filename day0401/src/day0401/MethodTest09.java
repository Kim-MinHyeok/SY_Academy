package day0401;

public class MethodTest09 {
	public static int comparison (int[] a) {
		int max=a[0];
		for (int i=1; i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		
		System.out.println(comparison(a));
	}

}
