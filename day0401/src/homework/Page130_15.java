package homework;

public class Page130_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][5];
		int[] ran = new int[5];
		int check = 0;		
		ran[0] = (int)(Math.random() * 15);
		
		for(int i=1; i<ran.length;) {
			ran[i] = (int)(Math.random() * 15);
			 
			for (int j=0;j<i;j++) {
				if (ran[i] == ran[j]) {
					check +=1;
				} 
			}
			
			if(check > 0) {
				ran[i] = (int)(Math.random() * 15);
				check = 0;
			} else {
				i++;
			}
		}
		
		for(int i=0;i<5;i++) {
			a[ran[i]/5][ran[i]%5] = 1;
//			System.out.print("("+ran[i]/5 + ", "+ran[i]%5+")");
			System.out.println(ran[i]);
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + "");
			}
			System.out.println( "");
		}
	}

}
