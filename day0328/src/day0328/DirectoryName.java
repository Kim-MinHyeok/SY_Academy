package day0328;

import java.util.Scanner;

public class DirectoryName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String driveName, directoryName, fileName, extension;
		
		System.out.print("����̺� �̸��� �Է��ϼ��� : ");
		driveName = sc.next();
		System.out.print("���丮 �̸��� �Է��ϼ��� : ");
		directoryName = sc.next();
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		fileName = sc.next();
		System.out.print("Ȯ���� �̸��� �Է��ϼ��� : ");
		extension = sc.next();

		System.out.print("������ �̸��� : " + driveName+":" + directoryName + fileName + "."+ extension);
		
	}
}