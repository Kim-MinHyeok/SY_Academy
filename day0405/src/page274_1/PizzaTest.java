package page274_1;

class Circle {
	protected int radius;

	public Circle(int r) {
		radius = r;
	}
}

class Pizza extends Circle {
	String name;
	

	public Pizza(String name, int r) {
		super(r);
		this.name = name;
	}

	public void print() {
		System.out.println("피자의 종류 : " + name + ", 피자의 크기 : " + radius);
	}
}

public class PizzaTest {
	public static void main(String args[]) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}
}
