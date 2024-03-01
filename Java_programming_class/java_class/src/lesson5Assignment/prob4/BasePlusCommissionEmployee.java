package lesson5Assignment.prob4;

public class BasePlusCommissionEmployee extends CommisionEmployee {

	double baseSalary;
	
	public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
		super(grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment() {
		return baseSalary + (getGrossSales() * getCommissionRate());
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + "]";
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	

}
