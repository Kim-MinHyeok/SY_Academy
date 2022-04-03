package day0401;

public class MethodTest11 {
	public static double getAvg (double[] num) {
		double avg=0;
		
		for (int i=0;i<num.length;i++) {
			avg +=num[i];
		}
		
		return avg/num.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {1.0, 3.2, 5.7, 5.9, 8.5};
		
		System.out.println(getAvg(num));
	}

}
