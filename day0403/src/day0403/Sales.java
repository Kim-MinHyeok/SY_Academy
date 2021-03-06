package day0403;

import java.util.Scanner;

public class Sales {
	static String[] teamName = {"마케팅", "영업", "개발", "연구", "생산"};
	
	public static void teamSeasonSale(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(teamName[i]+"부의 "+(j+1)+"분기 매출액 : " + arr[i][j] + "원");
			}
		}
	}

	public static void companySeasonSale(int[][] arr) {
		int total = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<arr.length; j++) {
				total += arr[j][i];
			}
			System.out.println((i+1)+"분기의 회사 전체 매출액 : " + total + "원");
			total = 0;
		}
	}
	
	public static void companySeasonAverage(int[][] arr) {
		int total = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<arr.length; j++) {
				total += arr[j][i];
			}
			System.out.println((i+1)+"분기의 회사 전체 평균 매출액 : " + (total/4) + "원");
			total = 0;
		}
	}
	
	public static void max(int[][] arr) {
		
		for(int i=0; i<4; i++) {
			int max=arr[0][i];
			int maxTeamIndex = 0;
			
			for(int j=1; j<arr.length; j++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
					maxTeamIndex = j;
				}
			}
			System.out.println((i+1)+"분기의 최고 매출 부서 : " + teamName[maxTeamIndex] + "부");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[][] sale = new int[5][4];
		
		for (int i=0; i<sale.length; i++) {
			for (int j=0; j<sale[i].length;) {
				System.out.print(teamName[i]+"부의 "+(j+1)+"분기 매출액을 입력하세요 : ");
				sale[i][j] = sc.nextInt();
				if (sale[i][j] < 0) {
					System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
				} else {
					j++;
				}
			}
		}
		
		System.out.println("");
		teamSeasonSale(sale);
		System.out.println("");
		companySeasonSale(sale);
		System.out.println("");
		companySeasonAverage(sale);
		System.out.println("");
		max(sale);
	}
}
