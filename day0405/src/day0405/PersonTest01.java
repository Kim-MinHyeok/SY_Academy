package day0405;

class Person {
	String name;
	int age;
	int addr=0;

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
}

public class PersonTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Person p2 = new Person();
		
		p.setName("asd");
		
		p.addr = 1;
		
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}

}
