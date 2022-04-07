package day0404;

public class Rectangle {
	private int width;
	private int length;

	public int getWidth() {
		return width;
	}

	public Rectangle() {
	}
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(int width) {
		this.width = width;
	}
		
	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int calcArea() {
		int area=width*length;
		return area;
	}
}
