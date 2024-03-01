package lesson5Assignment.prob4;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	@Override
	public double getPayment() {
		return weeklySalary;
	}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	

}
