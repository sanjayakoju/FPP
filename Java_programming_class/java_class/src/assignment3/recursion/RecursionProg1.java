package assignment3.recursion;

import java.util.Scanner;

public class RecursionProg1 {

	public static void main(String[] args) {
		System.out.println(power(4,2));
	}
	
	public static double power(double x, int n) {
		if (n<=0) {
			return 1;
		} else {
			x = x * power(x, n-1);
			return x;
		}
	}
}
