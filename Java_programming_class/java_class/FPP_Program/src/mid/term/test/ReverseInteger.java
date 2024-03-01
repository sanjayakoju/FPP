package mid.term.test;

public class ReverseInteger {

	static void reverseInt(int num) {
		if(num <= 0) {
			return;
		}
		//System.out.println(num / 10);
		System.out.print(num % 10);
		reverseInt(num /  10);
	}
	
	public static void main(String[] args) {
		int num = 123456;
		reverseInt(num);
	}
}
