package day0401;

public class MaxTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"홍길동","유관순","이순신","김유신","강감찬"};
		int[] score = {40,70,30,100,90};
		int maxIndex = 0;
		
		for (int a=1; a < name.length; a++) {
			if (score[a] > score[maxIndex]) {
				maxIndex = a;
			}
		}
		
		System.out.println("최고점수 학생 : " + name[maxIndex] );
		System.out.println("최고점수 : " + score[maxIndex] );
	}

}
