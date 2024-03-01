package lesson5Assignment.prob1;

public class Rectangle extends Shape {

	int lenght;
	int width;
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.lenght = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return lenght * width;
	}
	
	public double calculatePerimeter() {
		return (2 * lenght) + (2 * width);
	}
}
