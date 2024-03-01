package lession1;

public class TempChar {
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;
		int greatest = a > b ? (a > c ? a: c) : (b > c ? b :c); 
		System.out.println(greatest);
	}
}
