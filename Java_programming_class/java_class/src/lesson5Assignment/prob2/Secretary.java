package lesson5Assignment.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

	double overtimeHours;
	
	public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary() {
		return salary + (12 * overtimeHours);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
}
