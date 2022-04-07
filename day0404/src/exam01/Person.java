package exam01;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		name = "±è¹ÎÇõ";
		age = 28;
		System.out.println("»ý¼ºÀÚ on");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat(String food) {
		System.out.println(age + "»ì " +name+"ÀÌ(°¡) "+food+"¸¦(À») ¸Ô¾î¿ä!");
	}
	
	public void wash(String soap) {
		System.out.println(age + "»ì " +name+"ÀÌ(°¡) "+soap+"(À¸)·Î ¾Ä¾î¿ä!");
	}
}
