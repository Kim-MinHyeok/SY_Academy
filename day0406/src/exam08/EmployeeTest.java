package exam08;

import java.util.Scanner;

//��� �������� ������ �� �������� �Ӽ���� ������� �̾� �θ�Ŭ������ ������
//==> �Ϲ�ȭ
abstract class Employee{
	protected String name;
	protected int no;
	protected int salary;
	public Employee(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public abstract void computeSalary();
	//�����޿�, �ð����޿� �� �޼ҵ带 ��üȭ �� �� �����!
	//�׷��� �ڽ�Ŭ�������� �ݵ�� �̸޼ҵ带 ������ �ϵ��� ����
	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", salary=" + salary + "]";
	}
	
	
	
}

//�ſ� ������ �޿��� �޴� ����
class SalairedEmployee extends Employee{
	private int hobong;			//ȣ��
	private int base;			//�⺻��	
	private int extra_pay;		//����
	public SalairedEmployee(String name, int no, int hobong) {
		super(name, no);
		this.hobong = hobong;
	}
	
	@Override
	public void computeSalary() {
		switch(hobong) {
			case 1: base=2500000;extra_pay=250000;break;
			case 2: base=3000000;extra_pay=300000;break;
			case 3: base=4000000;extra_pay=400000;break;
		}
		salary = base+extra_pay;
	}

	@Override
	public String toString() {
		return "SalairedEmployee [hobong=" + hobong + ", base=" + base + ", extra_pay=" + extra_pay + ", name=" + name
				+ ", no=" + no + ", salary=" + salary + "]";
	}

	
	
}

//���� �ð���ŭ �޿��� �޴� ����
class HourlyEmployee extends Employee{	
	private int hours;	
	private int base;
	public HourlyEmployee(String name, int no, int base, int hours) {
		super(name, no);
		this.base = base;
		this.hours = hours;
	}
	
	@Override
	public void computeSalary() {
		salary = base * hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", base=" + base + ", name=" + name + ", no=" + no + ", salary="
				+ salary + "]";
	}
	
	
}



public class EmployeeTest {
	public static void main(String[] args) {
	
		Employee []arr = new Employee[100];
		
		//����� ���� �Է¹ޱ�
		int type;
		int n=0;		//�迭�� �ε����� ���� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.������ ���, 2.�ð��� ���  0.����==>");
			type = sc.nextInt();
			
			if(type == 0) {
				break;
			}
			
			String name;
			int no;
			System.out.print("����� �̸�==>");
			name = sc.next();
			
			System.out.print("��� ��ȣ==>");
			no = sc.nextInt();
			
			if(type == 1) {
				int hobong;
				System.out.print("ȣ���� �Է��ϼ���==>");
				hobong = sc.nextInt();
				arr[n++] = new SalairedEmployee(name, no, hobong);
			}else if(type == 2) {
				int base, hours;
				System.out.print("�ð��� �޿��� �Է��ϼ���==>");
				base = sc.nextInt();
				System.out.print("���� �ð��� �Է��ϼ���==>");
				hours = sc.nextInt();
				arr[n++] = new HourlyEmployee(name, no, base, hours);				
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
			
		}//�Է��� ��
		
		//�޿��� ����ϰ� ����ϱ�
		for(int i=0; i<n;i++) {
			arr[i].computeSalary();
			System.out.println(arr[i]);
		}
		
	}
}
