package day0331;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {15,24,10,18,44,42};
		int temp;
		
		for (int i=0; i<data.length;i++) {

			System.out.print("[");
			
			for (int k=0; k<data.length;k++) {
				if(k == data.length-1) {
					System.out.print(data[k]);
				} else {
					System.out.print(data[k]+",");
				}
			}
			
			System.out.print("]");
			
			for (int j=i+1; j<data.length;j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
 			}
			
			System.out.println("");
		}
		

	}

}
