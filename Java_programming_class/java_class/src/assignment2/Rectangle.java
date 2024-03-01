package assignment2;

public final class Rectangle {
	private final double height;
	private final double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double computeArea() {
		return height * width;
	}

}
