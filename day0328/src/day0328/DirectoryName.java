package day0328;

import java.util.Scanner;

public class DirectoryName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String driveName, directoryName, fileName, extension;
		
		System.out.print("드라이브 이름을 입력하세요 : ");
		driveName = sc.next();
		System.out.print("디렉토리 이름을 입력하세요 : ");
		directoryName = sc.next();
		System.out.print("파일 이름을 입력하세요 : ");
		fileName = sc.next();
		System.out.print("확장자 이름을 입력하세요 : ");
		extension = sc.next();

		System.out.print("완전한 이름은 : " + driveName+":" + directoryName + fileName + "."+ extension);
		
	}
}
