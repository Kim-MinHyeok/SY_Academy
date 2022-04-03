package day0330;

import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, star="";
		int month, date;

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("생월을 입력하세요 : ");
		month = sc.nextInt();
		System.out.print("생일을 입력하세요 : ");
		date = sc.nextInt();

		switch (month) {
			case 1:
				star = (date <= 19) ? "염소자리" : "물병자리";
				break;
			case 2:
				star = (date <= 18) ? "물병자리" : "물고기자리";
				break;
			case 3:
				star = (date <= 20) ? "물고기자리" : "양자리";
				break;
			case 4:
				star = (date <= 19) ? "양자리" : "황소자리";
				break;
			case 5:
				star = (date <= 20) ? "황소자리" : "쌍둥이자리";
				break;
			case 6:
				star = (date <= 21) ? "쌍둥이자리" : "게자리";
				break;
			case 7:
				star = (date <= 22) ? "게자리" : "사자자리";
				break;
			case 8:
				star = (date <= 22) ? "사자자리" : "처녀자리";
				break;
			case 9:
				star = (date <= 23) ? "처녀자리" : "천칭자리";
				break;
			case 10:
				star = (date <= 22) ? "천칭자리" : "전갈자리";
				break;
			case 11:
				star = (date <= 22) ? "전갈자리" : "사수자리";
				break;
			case 12:
				star = (date <= 24) ? "사수자리" : "염소자리";
				break;
		}

		System.out.print(name + "님의 별자리는 " + star +"입니다.");

	}

}
