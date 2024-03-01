package lesson4democode;

public class TestRecursion {
  static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(5);

	}
	public static void display(int n){
		//count++;
		if(n==0)
			return;
		System.out.println("I am Recursive method");
		display(n-1);
	}

}
