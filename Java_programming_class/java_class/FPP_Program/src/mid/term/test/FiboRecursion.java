package mid.term.test;

public class FiboRecursion {

	int fibo(int n) {
		if (n==0 || n==1)
		{
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		FiboRecursion fiboRecursion = new FiboRecursion();
		int n = 5;
		System.out.println(fiboRecursion.fibo(n));
	}
}
