package homework;

public class Page130_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Clubs","Diamonds","Hearts","Spads"};
		String[] num = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int[] pickedName = new int[5];
		int[] pickedNum = new int[5];
		boolean check = false;
		
		for(int i=0; i<5;) {
			pickedName[i] = (int)(Math.random() * 4);
			pickedNum[i] = (int)(Math.random() * 13);
			
			for (int j=0; j<i; j++) {
				if(pickedName[j] == pickedName[i] && pickedNum[j] == pickedNum[i]) {
					check = true;
				}
			}
			
			if (check == true) {
			} else {
				System.out.println(name[pickedName[i]] + "�� "+ num[pickedNum[i]]);
				i++;
			}
			
			check = false;
		}
	}

}
