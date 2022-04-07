package day0405;

class Plane {
	String name;
	int passengers;
	String maker;
	static int cnt = 0;

	public Plane() {
		cnt++;
	}

	public Plane(String name) {
		this.name = name;
		cnt++;
	}

	public Plane(String name, int passengers) {
		this.name = name;
		this.passengers = passengers;
		cnt++;
	}

	public Plane(String name, int passengers, String maker) {
		this.name = name;
		this.passengers = passengers;
		this.maker = maker;
		cnt++;
	}
	
	public static void getCount() {
		System.out.println(cnt);
	}
}

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane("a380");
		Plane p3 = new Plane("안토노프",800,"러시아");
		
		Plane.getCount();
		
	}

}
