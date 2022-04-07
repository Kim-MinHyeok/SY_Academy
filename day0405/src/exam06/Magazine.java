package exam06;

public class Magazine extends Book {
	private String releaseDate;

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Magazine(String title, int page, String writher, String releaseDate) {
		super(title, page, writher);
		this.releaseDate = releaseDate;
	}

}
