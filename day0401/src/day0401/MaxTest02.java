package day0401;

public class MaxTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"ȫ�浿","������","�̼���","������","������"};
		int[] score = {40,70,30,100,90};
		int maxIndex = 0;
		
		for (int a=1; a < name.length; a++) {
			if (score[a] > score[maxIndex]) {
				maxIndex = a;
			}
		}
		
		System.out.println("�ְ����� �л� : " + name[maxIndex] );
		System.out.println("�ְ����� : " + score[maxIndex] );
	}

}