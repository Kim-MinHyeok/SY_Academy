package day0331;

public class Page128_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "";
		int i=1,j;

		do {
			temp = Integer.toString(i);																// ������ ���ڿ��� ��ȯ�ؼ� �ӽ� ����(temp)�� ����
			j = 0;
			
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) { 					// �ӽ� ������ 3, 6, 9 �� �����ϴ��� �˻�
				do { 											// ������ ��� �ӽú����� �ڸ������� ��� �˻��ؼ� 
					if (temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {	// 3, 6, 9�� ���Ե� ����ŭ "¦" �� ����Ѵ�
						System.out.print("¦");
					} 
					j++;
				} while (j < temp.length());
				System.out.print(" ");
			} else {
				System.out.print(i + " ");															// �ӽ� ������ 3, 6, 9�� ������ �׳� i�� ����Ѵ�
			}
			
			i++;
			temp = "";
		} while (i<=50);
	}
}