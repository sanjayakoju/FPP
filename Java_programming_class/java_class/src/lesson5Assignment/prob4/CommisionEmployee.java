package lesson5Assignment.prob4;

public class CommisionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	

	@Override
	public double getPayment() {
		return grossSales * commissionRate;
	}

	public CommisionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	

}