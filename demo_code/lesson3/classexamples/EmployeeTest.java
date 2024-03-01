package lesson3.classexamples;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
			
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl","Jones", 75000,1987, 12,15);
		staff[1] = new Employee("Harry","Rogers", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony", "Atkinson", 40000, 1990, 3, 15);

		for(Employee e : staff) {
			e.raiseSalary(5);
		}
		for(Employee e : staff) {
			System.out.println("name = "+e.getName() +
						", salary = "+e.getSalary() +
						", hire day = "+e.getHireDay());
		}
		// Importance of cloning 
		Employee e = new Employee("Bob","Bob",100000,1999,5,5);
		System.out.printf("\nBefore change %tD",e.getHireDay());
		Date d = e.getHireDay();
		d.setTime(1000L);
		System.out.printf("\nAfter change %tD",e.getHireDay());
		
	}

}
