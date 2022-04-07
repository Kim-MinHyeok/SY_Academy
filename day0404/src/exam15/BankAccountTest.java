package exam15;

class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		if(this.balance - amount < 0) {
			System.out.println("잔액이 모자랍니다.");
		} else {
			this.balance -= amount;
		}
	}
	
	public void printBalance() {
		System.out.println(balance);
	}
	
	public void addInterest() {
		double interest = 1.075;
		interest = (double)balance*interest;
		this.balance = (int)interest;
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);
		a1.printBalance();
		a2.printBalance();
		
		System.out.println();
		
		a1.withdraw(60);
		a2.withdraw(30);
		a1.printBalance();
		a2.printBalance();
		
		System.out.println();
		
		a1.addInterest();
		a2.withdraw(300);
		a1.printBalance();
		a2.printBalance();
	}

}
