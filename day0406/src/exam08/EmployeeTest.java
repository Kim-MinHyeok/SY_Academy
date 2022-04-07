package exam08;

import java.util.Scanner;

//모든 직원들이 가져야 할 공통적인 속성들과 기능을을 뽑아 부모클래스를 만들어요
//==> 일반화
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
	//고정급여, 시간제급여 이 메소드를 구체화 할 수 없어요!
	//그러나 자식클래스들은 반드시 이메소드를 재정의 하도록 강제
	@Override
	public String toString() {
		return "Employee [name=" + name + ", no=" + no + ", salary=" + salary + "]";
	}
	
	
	
}

//매월 정해진 급여를 받는 직원
class SalairedEmployee extends Employee{
	private int hobong;			//호봉
	private int base;			//기본급	
	private int extra_pay;		//수당
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

//일한 시간만큼 급여를 받는 직원
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
		
		//사원의 정보 입력받기
		int type;
		int n=0;		//배열의 인덱스를 위한 변수
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.월급제 사원, 2.시간제 사원  0.종료==>");
			type = sc.nextInt();
			
			if(type == 0) {
				break;
			}
			
			String name;
			int no;
			System.out.print("사원의 이름==>");
			name = sc.next();
			
			System.out.print("사원 번호==>");
			no = sc.nextInt();
			
			if(type == 1) {
				int hobong;
				System.out.print("호봉을 입력하세요==>");
				hobong = sc.nextInt();
				arr[n++] = new SalairedEmployee(name, no, hobong);
			}else if(type == 2) {
				int base, hours;
				System.out.print("시간당 급여를 입력하세요==>");
				base = sc.nextInt();
				System.out.print("일한 시간을 입력하세요==>");
				hours = sc.nextInt();
				arr[n++] = new HourlyEmployee(name, no, base, hours);				
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
			
		}//입력의 끝
		
		//급여를 계산하고 출력하기
		for(int i=0; i<n;i++) {
			arr[i].computeSalary();
			System.out.println(arr[i]);
		}
		
	}
}
