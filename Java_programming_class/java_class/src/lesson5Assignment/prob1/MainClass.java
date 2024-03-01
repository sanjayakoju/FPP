package lesson5Assignment.prob1;

public class MainClass {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[5];
		shapes[0] = new Rectangle("Red", 10, 20);
		shapes[1] = new Circle("White", 5.5);
		shapes[2] = new Square("Blue", 4);
		shapes[3] = new Rectangle("Green", 20, 30);
		shapes[4] = new Circle("Pink", 7.5);
		printTotal(shapes);
	}
	
	public static void printTotal(Shape shapes[]) {
		for (Shape shape: shapes) {
			System.out.println("Perimeter of "+shape.getClass().getSimpleName() + " : "+shape.calculatePerimeter());
		}
	}
}
