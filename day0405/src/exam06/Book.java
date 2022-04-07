package exam06;

public class Book {
	protected String title;
	protected int page;

	public Book() {
	}

	public Book(String title, int page, String writher) {
		super();
		this.title = title;
		this.page = page;
		this.writher = writher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWrither() {
		return writher;
	}

	public void setWrither(String writher) {
		this.writher = writher;
	}

	protected String writher;

}
