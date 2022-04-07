package day0405;

class SistUtil {
	public int getMax(int a[]) {
		int max=a[0];
		
		for (int i=1; i<a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
}

public class SistUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
