package exam06;

abstract class Employee {
	protected String name;
	protected int empNumber;
	protected int salary;

	public Employee(String name, int empNumber) {
		this.name = name;
		this.empNumber = empNumber;
	}

	abstract void computeSalary();

	@Override
	public String toString() {
		return "이름=" + name + ", 사번=" + empNumber + ", 급여=" + salary;
	}
}

class SalariedEmployee extends Employee {
	private int monthlySalary;

	public SalariedEmployee(String name, int empNumber, int monthlySalary) {
		super(name, empNumber);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public void computeSalary() {
		salary = monthlySalary;
	}
}

class HourlyEmployee extends Employee {
	private int hourlySalary;
	private int workedHour;

	public HourlyEmployee(String name, int empNumber, int hourlySalary, int workedHour) {
		super(name, empNumber);
		this.hourlySalary = hourlySalary;
		this.workedHour = workedHour;
	}

	@Override
	public void computeSalary() {
		salary = hourlySalary*workedHour;
	}
}

public class SalaryTest {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		
		arr[0] = new SalariedEmployee("홍길동", 1001, 3);
		arr[1] = new HourlyEmployee("이순신", 1002, 30000, 10);
		arr[2] = new SalariedEmployee("유관순", 1003, 2);
	}

}
