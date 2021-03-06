package day0403;

public class ArrayCalculate {
	public static int getTotal(int[] arr) {
		int total = 0;
		
		for(double i: arr) {
			total += i;
		}
		
		return total;
	}
	
	public static int getAverage(int[] arr) {
		int avg = getTotal(arr)/arr.length;
		return avg;
	}
	
	public static int getMaximum(int[] arr) {
		int max=arr[0];
	
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > arr[i-1]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int getMinimum(int[] arr) {
		int min=arr[0];
	
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < arr[i-1]) {
				min = arr[i];
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
