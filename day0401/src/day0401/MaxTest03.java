package day0401;

public class MaxTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"ȫ�浿","������","�̼���","������","������"};
		int[] score = {40,70,30,100,90};
		int maxIndex = 0, max;
		int[] sameMaxIndex = new int[score.length];
		
		for (int a=1; a < name.length; a++) {
			if (score[a] > score[maxIndex]) {
				maxIndex = a;
			}
		}
		
		max = score[maxIndex];
		
		int j = 0;
		
		for (int a=0; a < name.length; a++) {
			if (score[a] == max) {
				sameMaxIndex[j] = a;
				j++;
			}
		}
		
		System.out.println("�ְ����� �л� : " + name[maxIndex] );
		System.out.println("�ְ����� : " + score[maxIndex] );
	}

}
