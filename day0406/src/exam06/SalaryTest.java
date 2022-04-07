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
		return "�̸�=" + name + ", ���=" + empNumber + ", �޿�=" + salary;
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
		
		arr[0] = new SalariedEmployee("ȫ�浿", 1001, 3);
		arr[1] = new HourlyEmployee("�̼���", 1002, 30000, 10);
		arr[2] = new SalariedEmployee("������", 1003, 2);
	}

}
