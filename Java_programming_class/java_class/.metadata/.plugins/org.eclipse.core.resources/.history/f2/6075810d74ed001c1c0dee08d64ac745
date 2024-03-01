package assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob1 {

	void getInput() {
	
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Integer Value: ");
			Integer inputInt = scanner.nextInt();
			if (inputInt < 0 || inputInt > 100) {
				throw new UnsupportedOperationException("Input not in the range of 0-100");
			}
			System.out.println(inputInt);

		} catch (InputMismatchException ex) {
			System.out.println("Input is not an Integer: " + ex);
		}
	}


	public static void main(String[] args) {
		Prob1 ob = new Prob1();
		try {
			ob.getInput();
		} catch (UnsupportedOperationException | InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}
