package day0331;

public class GuguDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1; 
		
		do{
			System.out.println(i + "??");
			do {
				System.out.println(i + "*" + j + " = " + i*j);
				j++;
			} while (j <= 9);
			System.out.println("-----------------------------");
			i++;
			j=1;
		} while (i <= 9);

	}

}
