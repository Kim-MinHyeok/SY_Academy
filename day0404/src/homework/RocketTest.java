package homework;

class Rocket {
	int x, y;
	
	Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		String str="로켓의 좌표 = ("+x+", "+y+")";
		return str;
	}
	
	public void moveUp() {
		this.y += 1;
	}
}

public class RocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rocket rocket = new Rocket(12,34);
		
		rocket.moveUp();
		System.out.println(rocket.toString());
	}

}
