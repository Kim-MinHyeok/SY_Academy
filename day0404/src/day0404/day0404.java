package day0404;

import java.util.Scanner;

public class day0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] tot = new int[5];
		double[] avg = new double[5];
		
		for (int i=0; i<name.length; i++) {
			System.out.print((i+1)+"��° �л��� �̸��� �Է��ϼ��� : ");
			name[i] = sc.next();
			
			System.out.print((i+1)+"��° �л��� ���� ������ �Է��ϼ��� : ");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+"��° �л��� ���� ������ �Է��ϼ��� : ");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+"��° �л��� ���� ������ �Է��ϼ��� : ");
			math[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i]/3.0;
			}
		
		System.out.println("�̸�\t����\t������\t����\t����\t���");
		for (int k=0; k<name.length; k++) {
			System.out.println(name[k] + "\t" 
										+ kor[k]+"\t"
										+eng[k]+"\t"
										+math[k]+"\t"
										+avg[k]+"\t");
		}
		
		System.out.println("---------------------------------");
		System.out.println("���� ������ ����");
		for (int i=0; i<name.length; i++) {
			for (int j=0; j<name.length; j++) {
				if(tot[j] > tot[i]) {
					String name_temp = name[i];
					name[i] = name[j];
					name[j] = name_temp;
					
					int temp = kor[i];
					kor[i] = kor[j];
					kor[j] = temp;	
					
					temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;	
					
					temp = math[i];
					math[i] = math[j];
					math[j] = temp;	
					
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;	
					
					double temp_avg = avg[i];
					avg[i] = avg[j];
					avg[j] = temp;	
				}
			}
		}
	}

}
