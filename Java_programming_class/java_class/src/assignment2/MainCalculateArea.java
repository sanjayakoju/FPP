package assignment2;

import java.util.Scanner;

public class MainCalculateArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		String type = scanner.next();
		switch(type) {
		case "C": {
			System.out.println("Enter radius of the Circle");
			double radius = scanner.nextDouble();
			Circle circle = new Circle(radius);
			double area = circle.computeArea();
			System.out.println("The area of circle is : " +area);
			break;
		}
		case "R":{
			System.out.println("Enter height of the Rectangle");
			double height = scanner.nextDouble();
			System.out.println("Enter width of the Rectangle");
			double width = scanner.nextDouble();
			Rectangle rectangle = new Rectangle(height, width);
			double area = rectangle.computeArea();
			System.out.println("The area of rectangle is : " +area);
			break;
		}
		case "T":{
			System.out.println("Enter height of the Triangle");
			double height = scanner.nextDouble();
			System.out.println("Enter base of the Triangle");
			double base = scanner.nextDouble();
			Triangle triangle = new Triangle(base, height);
			double area = triangle.computeArea();
			System.out.println("The area of triangle is : " +area);
			break;
		}
		default: {
			System.out.print("Error! Wrong input.");
			break;
		}
		}
	}
}
