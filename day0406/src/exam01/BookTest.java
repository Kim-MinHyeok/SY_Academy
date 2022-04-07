package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("=============================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("=============================");
		System.out.print("1 ~ 4의 메뉴를 입력하세요 : ");
	}

	public static void insertBook(ArrayList<Book> list) {
		String title;
		int score;
		
		System.out.print("제목 : ");
		title = sc.next();
		
		System.out.print("평점 : ");
		score = sc.nextInt();
		
		Book book = new Book(title, score);
		list.add(book);
		
		System.out.println("도서의 평점을 등록했습니다.");
	}

	public static void searchBook(ArrayList<Book> list) {
		String title;
		int score = -1;
		System.out.print("찾고자 하는 도서명을 입력 : ");
		title = sc.next();

		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			
			if(b.title.equals(title)) {
				score = b.score;
			}
		}
		
		if (score != -1) {
			System.out.println(title + "도서의 평점은 " + score + "입니다.");
		} else {
			System.out.println(title + "도서의 평점은 없습니다.");
		}

	}

	public static void printBook(ArrayList<Book> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<Book>();
		int menu;

		while (true) {
			printMenu();
			menu = sc.nextInt();

			if (menu == 4) {
				break;
			}

			switch (menu) {
			case 1:
				insertBook(list);
				break;
			case 2:
				searchBook(list);
				break;
			case 3:
				printBook(list);
				break;
			}
		}
	}

}
