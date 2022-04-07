package exam09;

import java.util.ArrayList;

abstract class A {
	public abstract void pro();
}

class B extends A {
	public void pro() {
		System.out.println("B의 pro입니다.");
	}
}

class C extends A {
	public void pro() {
		System.out.println("C의 pro입니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		ArrayList<A> list = new ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for(int i=0;i<list.size();i++) {
			A ob = list.get(i);
			ob.pro();
		}
	}

}
