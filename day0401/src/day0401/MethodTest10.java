package day0401;

public class MethodTest10 {
	public static String getScoreName (String[] name, int[] score) {
		String max_name = "";
		int max = score[0];
		int idx = 0;
		
		for (int i=0;i<name.length;i++) {
			if(score[i] > max) {
				max = score[i];
				idx = i;
			}
		}
		
		max_name = name[idx];
		return max_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"뉴턴","아인슈타인","폰노이만"};
		int[] score = {92,96,100};
		
		System.out.println(getScoreName(name,score));
	}

}
