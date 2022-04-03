package day0401;

public class MethodTest12_arrayComparison {
	public static boolean comparison (int[] num, int[] num2) {
		boolean same = false;
		int cnt = 0;
		
		if(num.length != num2.length) {
			same = false;
			return same;
		} else {
			
			for (int i=0; i < num.length; i++) {
				for(int j=0; j < num.length; j++) {
					if (num[i] == num2[j]) {
						cnt++;
						break;
					}
				}
			}
			
			if (cnt == num.length) {
				same = true;
			}
		}
		
		return same;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5};
		int[] num2 = {1,2,3,5,2};
		
		System.out.println(comparison(num,num2));
	}

}
