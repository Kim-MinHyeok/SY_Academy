package exam01;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		name = "�����";
		age = 28;
		System.out.println("������ on");
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
		System.out.println(age + "�� " +name+"��(��) "+food+"��(��) �Ծ��!");
	}
	
	public void wash(String soap) {
		System.out.println(age + "�� " +name+"��(��) "+soap+"(��)�� �ľ��!");
	}
}
