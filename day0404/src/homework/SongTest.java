package homework;

class Song {
	String title, artist;
	int length;

	public Song() {
	}

	public Song(String title) {
		this(title, null, 0);
	} 

	public Song(String title, String artist) {
		this(title, artist, 0);
	}
	
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
}

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalaya", "Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
	}

}
