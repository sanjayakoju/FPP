package lesson5Assignment.prob4;

public class DriverClass {
	
	public static void main(String[] args) {
		BasePlusCommissionEmployee bpc = new BasePlusCommissionEmployee(1000, 10, 1000);
		CommisionEmployee ce = new CommisionEmployee(1000, 10);
		HourlyEmployee he = new HourlyEmployee(1000, 7);
		SalariedEmployee se1 = new SalariedEmployee(4000);
		SalariedEmployee se2 = new SalariedEmployee(5000);
		
		Employee employees[] = new Employee[5];
		employees[0] = bpc;
		employees[1] = ce;
		employees[2] = he;
		employees[3] = se1;
		employees[4] = se2;
		
		for (Employee e: employees) {
			System.out.println(e.getClass().getSimpleName() + " : " +e.getPayment());
		}
	}

}