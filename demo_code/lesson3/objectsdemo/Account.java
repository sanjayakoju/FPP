package lesson3.objectsdemo;

public class Account {
	private String id;
	private double balance;
	
	Account() {
		id = generateId();
	}
	
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	
	private String generateId() {
		//in reality, read from a database or
		//external data source
		return ""+RandomNumbers.getRandomInt(1000,9999);
	}
	
	
}
