package day0330;

public class Page128_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "";
		int num = 0;

		for (int i = 1; i <= 50; i++) {
			temp = Integer.toString(i);																// ������ ���ڿ��� ��ȯ�ؼ� �ӽ� ����(temp)�� ����
			
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) { 					// �ӽ� ������ 3, 6, 9 �� �����ϴ��� �˻�
				for (int j = 0; j < temp.length(); j++) { 											// ������ ��� �ӽú����� �ڸ������� ��� �˻��ؼ� 
					if (temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {	// 3, 6, 9�� ���Ե� ����ŭ(num) "¦" �� ����Ѵ�
						num++;
						System.out.print("¦");
					} 
				}
				System.out.print(" ");
			} else {
				System.out.print(i + " ");															// �ӽ� ������ 3, 6, 9�� ������ �׳� i�� ����Ѵ�
			}		
			
			temp = "";
			num = 0;	
		}
	}
}