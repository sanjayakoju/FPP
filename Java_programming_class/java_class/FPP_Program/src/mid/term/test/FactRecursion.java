package mid.term.test;

public class FactRecursion {

	int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		FactRecursion factRecursion = new FactRecursion();
		int n = 5;
		System.out.println(factRecursion.fact(n));
	}
}
