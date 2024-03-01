package lesson3.overload;

class Overload {
	// Overload ovlDemo without parameter
	void ovlDemo() {

		System.out.println("No parameters");
	}

	// Overload ovlDemo for one integer parameter.
	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
	}

	// Overload ovlDemo for two integer parameters.
	int ovlDemo(int a, int b) {
		System.out.println("Two parameters: " + a + " " + b);
		return a + b;
	}
	double ovlDemo(int x, int y,int z) {
		System.out.println("Two parameters: " + x + " " + y);
		return x + y;
	}

	// Overload ovlDemo for two double parameters.
	double ovlDemo(double a, double b) {
		System.out.println("Two double parameters: " + a + " " + b);
		return a + b;
	}

	String ovlDemo(double a, double b, double c) {
		return Double.toString(a + b);
	}
	
	double ovlDemo(char a, double b){ return 0.00;}
	
}

public class OverLoadDemo {

	public static void main(String[] args) {

		Overload ob = new Overload();
		int resI;
		double resD;
		// call all versions of ovlDemo()
		ob.ovlDemo();
		System.out.println();
		ob.ovlDemo(2);
		System.out.println();
		resI = ob.ovlDemo(4, 6);
		System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
		System.out.println();
		resD = ob.ovlDemo(1.1, 2.32);
		ob.ovlDemo('c');
		System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
		//resI = ob.ovlDemo(4, 6.8); // Overloading is the compile time
		// polymorphism
	}

}
