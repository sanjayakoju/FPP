package lesson5Assignment.prob4;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;

	@Override
	public double getPayment() {
		return wage * hours;
	}

	
	
	public HourlyEmployee(double wage, double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}



	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
	}



	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	

}
