package day0331;

public class Page128_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "";
		int i=1,j;

		do {
			temp = Integer.toString(i);																// 정수를 문자열로 변환해서 임시 변수(temp)에 저장
			j = 0;
			
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) { 					// 임시 변수가 3, 6, 9 를 포함하는지 검사
				do { 											// 포함할 경우 임시변수의 자릿수마다 모두 검색해서 
					if (temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {	// 3, 6, 9가 포함된 수만큼 "짝" 을 출력한다
						System.out.print("짝");
					} 
					j++;
				} while (j < temp.length());
				System.out.print(" ");
			} else {
				System.out.print(i + " ");															// 임시 변수에 3, 6, 9가 없으면 그냥 i를 출력한다
			}
			
			i++;
			temp = "";
		} while (i<=50);
	}
}
