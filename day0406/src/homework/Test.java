package homework;

import java.util.ArrayList;

class GameCharacter {
	public void draw() {
		System.out.println("GameCharacter()의 draw()");
	}

	public void getLife() {
		System.out.println("GameCharacter()의 getLife()");
	}

//	public static void drawAll(GameCharacter[] g) {
//		for(int i = 0; i<g.length; i++) {
//			g[i].draw();
//		}
//	}

	public static void drawAll(Object[] g) {
		for (int i = 0; i < g.length; i++) {
			if (g[i] instanceof Hobbit) {
				((Hobbit) g[i]).draw();
			} else if (g[i] instanceof Titan) {
				((Titan) g[i]).draw();
			} else if (g[i] instanceof Sorcerer) {
				((Sorcerer) g[i]).draw();
			}
		}
	}
}

class Hobbit extends GameCharacter {
	public void draw() {
		System.out.println("호빗을 그립니다.");
	}

	public void getRing() {

	}

}

class Titan extends GameCharacter {
	public void draw() {
		System.out.println("타이탄을 그립니다.");
	}
}

class Sorcerer extends GameCharacter {
	public void draw() {
		System.out.println("소서러를 그립니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		GameCharacter[] arr = new GameCharacter[6];

		GameCharacter h1 = new Hobbit();
		GameCharacter h2 = new Hobbit();
		GameCharacter t1 = new Titan();
		GameCharacter t2 = new Titan();
		GameCharacter s1 = new Sorcerer();
		GameCharacter s2 = new Sorcerer();

		arr[0] = h1;
		arr[1] = h2;
		arr[2] = t1;
		arr[3] = t2;
		arr[4] = s1;
		arr[5] = s2;

		GameCharacter.drawAll(arr);
	}

}
