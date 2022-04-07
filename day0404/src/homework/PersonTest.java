package homework;

class Person {
	private String name, mobile, office, email;

	public String getName() {
		return name;
	}

	public Person(String name, String mobile, String office, String email) {
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		String str="ÀÌ¸§ = "+name;
		return str;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("È«±æµ¿", "010-1234-5678", "02-123-4567", "abcd@naver.com");
	}

}
