package exam01;

public class Book {
	String title;
	int score;
	static int count;

	public Book() {
		super();
	}
	
	public Book(String title, int score) {
		super();
		this.title = title;
		this.score = score;
		count ++;
	}
	
	public String toString() {
		return "title = " + title + ", score = " + score;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
