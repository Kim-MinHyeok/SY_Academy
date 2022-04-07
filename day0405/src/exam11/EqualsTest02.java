package exam11;

class Box {
	double width;
	double length;
	double height;

	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		Box b = (Box)o;
		
		if(this.width == b.width && this.length == b.length && this.height == b.height) {
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
}

public class EqualsTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(10, 20, 30);
		Box b2 = new Box(10, 20, 30);
	
		if(b1.equals(b2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
