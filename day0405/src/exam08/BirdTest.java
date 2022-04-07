package exam08;

class Bird {
	String name, color;
	boolean wing;

	public String getName() {
		return name;
	}

	public Bird(String name, String color, boolean wing) {
		super();
		this.name = name;
		this.color = color;
		this.wing = wing;
	}

	public void fly() {
		if(wing == true) {
			System.out.println();
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWing() {
		return wing;
	}

	public void setWing(boolean wing) {
		this.wing = wing;
	}

}

class Plane extends Bird {
	private boolean engine;

	public Plane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	
	public void fly() {
		if(wing == true && engine == true) {
			System.out.println();
		}
	}
}

public class BirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
