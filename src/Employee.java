
public class Employee {

	private int empNo;
	private String empName;
	private double salary;
    
	private static int autogen;
	
	static
	{
		System.out.println("class loading.....");
		autogen=1001;
	}
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("empNo:" + empNo);
		System.out.println("empName:" + empName);
		System.out.println("salary:" + salary);
	}

	public double getsalary() {
		return salary;
	}
}
