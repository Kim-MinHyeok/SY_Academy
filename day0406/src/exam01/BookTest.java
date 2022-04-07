package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("=============================");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. ��� å ���");
		System.out.println("4. ����");
		System.out.println("=============================");
		System.out.print("1 ~ 4�� �޴��� �Է��ϼ��� : ");
	}

	public static void insertBook(ArrayList<Book> list) {
		String title;
		int score;
		
		System.out.print("���� : ");
		title = sc.next();
		
		System.out.print("���� : ");
		score = sc.nextInt();
		
		Book book = new Book(title, score);
		list.add(book);
		
		System.out.println("������ ������ ����߽��ϴ�.");
	}

	public static void searchBook(ArrayList<Book> list) {
		String title;
		int score = -1;
		System.out.print("ã���� �ϴ� �������� �Է� : ");
		title = sc.next();

		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			
			if(b.title.equals(title)) {
				score = b.score;
			}
		}
		
		if (score != -1) {
			System.out.println(title + "������ ������ " + score + "�Դϴ�.");
		} else {
			System.out.println(title + "������ ������ �����ϴ�.");
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
