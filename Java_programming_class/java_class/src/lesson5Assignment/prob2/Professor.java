package lesson5Assignment.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	
	int numberOfPublications;

	public Professor(String name, double salary, LocalDate hireDate, int numberOfPublicatios) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublicatios;
	}
	
	public double computeSalary() {
		return salary;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	
	
}
