package lesson3.classexamples;

public class Apple {
	// Instance Variable
	private String color;
	private double wt;
	private double price;
	
	// Various Constructors
	Apple(){ // Default Constructor
		this.color = "Red"; // this indicates current object
		this.wt=0.450;
		this.price = 1.2;
	}
  // Parameterized Constructor
	Apple(String color, double wt,double price){
		this.color = color;
		this.wt = wt;
		this.price = price;
	}
	
	// Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWt() {
		return wt;
	}
	public void setWt(double wt) {
		this.wt = wt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// Display the current status of object
	
	@Override
	public String toString(){
		return  color + " " + wt + " " + price;
	}
}
