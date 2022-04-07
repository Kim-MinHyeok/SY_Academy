package homework;

abstract class Book {
	protected int number;
	protected String title;
	protected String author;
	protected int fee=0;

	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}

	void getLateFees(int day) {
		// TODO Auto-generated method stub
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

class Novel extends Book {

	public Novel(int number, String title, String author) {
		super(number, title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getLateFees(int day) {
		this.fee = day*300;
	}
}

class Poet extends Book {

	public Poet(int number, String title, String author) {
		super(number, title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getLateFees(int day) {
		this.fee = day*200;
	}
}

class ScienceFiction extends Book {

	public ScienceFiction(int number, String title, String author) {
		super(number, title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getLateFees(int day) {
		this.fee = day*600;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Novel novel = new Novel(1001, "토지", "박경리");
		Poet poet = new Poet(1002, "은행나무", "서정주");
		ScienceFiction sf = new ScienceFiction(1003, "아이 로봇", "아이작 아시모프");

		novel.getLateFees(2);
		poet.getLateFees(5);
		sf.getLateFees(7);
		
		System.out.println(novel.getFee());
		System.out.println(poet.getFee());
		System.out.println(sf.getFee());
	}
}
