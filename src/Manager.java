
public class Manager extends Employee {

	private double commission;

	public Manager() {
	}

	public Manager(String empName, double salary, double commision) {
		super(empName, salary);
		this.commission = commision;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("commision:" + commission);
	}

	@Override
	public double getsalary() {
		// TODO Auto-generated method stub
		return super.getsalary() + commission;

	}

}
