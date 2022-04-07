package exam05;

public class Customer extends Person {
	private int no;
	private int mileage;

	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name,addr,phone);
		this.no = no;
		this.mileage = mileage;
	}
	
}
