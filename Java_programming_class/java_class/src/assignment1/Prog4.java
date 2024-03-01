package assignment1;

public class Prog4 {
	public static void main(String[] args) {
		float number1 = 1.27f, number2 = 3.881f, number3 = 9.6f;
		int sum1 = (int) (number1 + number2 + number3);
		System.out.println("Sum 1 : "+sum1);
		int sum2 = Math.round(number1) + Math.round(number2) + Math.round(number3);
		System.out.println("Sum 2 : "+sum2);
	}
}
