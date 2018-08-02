
public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("polo", 5000);
		e.payslip();
		
		Manager m = new Manager("ks", 7000, 2000);
		m.payslip();
		showsalary(m);
		

		Executive e1 = new Executive("srk", 10000, 500);
		e1.payslip();
		showsalary(e1);
		
	}

	private static void showsalary(Employee emp) {
	 if 	
      System.out.println(emp.getsalary());		
	}

//	private static void showsalary(Executive e1) {
//		System.out.println(e1.getsalary());
//		
//	}
//
//	private static void showsalary(Manager m) {
//		System.out.println(m.getsalary());
//		
//	}
}
