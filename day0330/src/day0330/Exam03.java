package day0330;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 66;

		// ����
		if (age > 20)
			if (age < 65)
				System.out.println("1�� �׷�");
			else
				System.out.println("2�� �׷�");

		// 1�� Ǯ��
		if (age > 20) {
			if (age < 65) {
				System.out.println("1�� �׷�");
			}
		} else {
			System.out.println("2�� �׷�");
		}

		// 2�� Ǯ��
		if (age > 20)
			if (age < 65)
				System.out.println("1�� �׷�");
			else
				System.out.println("2�� �׷�");
		
		// ��ø if���� ���� else�� ���� ���� ����� if�� ������ �ȴ�

	}

}
