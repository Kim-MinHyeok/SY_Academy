package homework;

public class Page126_9 {
	class Dog {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myInt; 										//9
		char[] myChar;
//		int [6] myInt2;
		Dog myDog[];		
//		Dog myDog [5];
		
		int[] studentNumber = new int[30];					//10
		double[] values = {1.2, 3.3, 6.7};
		
		int[] a = new int[10];								//11
		a[0] = 100;
		a[1] = a[0];
		
//		arr[5] 의 인덱스는 0~4 까지. 넘어가면 배열 인덱스 범위 초과 오류	//12
		
		double[] values2 = new double[100];					//13
		for (int i=0; i<values2.length; i++) {
			values2[i] = 0;
		}
		
		try {
			int s = studentNumber[30];						//14
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("오류 발생");
			
		}
	}

}
