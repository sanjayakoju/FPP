package assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private int age;
	
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
	
	public HeartRates(String fName, String lName, LocalDate dob, int age) {
		this.firstName = fName;
		this.lastName = lName;
		this.dateOfBirth = dob;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "FirstName : " + firstName + "\nLastName : " + lastName + "\nDate Of Birth : " + dateOfBirth
				+ "\nAge : " + age ;
	}


	public static void main(String[] args) {
		final int RHR = 70;
		final float LB = 0.5f;
		final float UB = 0.85f;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your first name");
		String fName = scanner.next();
		System.out.println("Please, enter your last name");
		String lName = scanner.next();
		
		LocalDate dob = getDob();
		int age = getAge(dob);
		int MHR = getMaxHeartRate(age);
		double AHR = getAvgHeartRate(MHR, RHR);
		String THRR = targetHeartRange(LB, UB, RHR, AHR);
		System.out.println(THRR);
		
		HeartRates heartRates = new HeartRates(fName, lName, dob, age);
		System.out.println(heartRates);
		System.out.println("Maximum Heart Rate : "+MHR);
	}
	
	static LocalDate getDob() {
		while (true) {
			System.out.println("Please, enter your date of birth in the format-(yyyy-m-d)");
            Scanner scanner = new Scanner(System.in);
			String input = scanner .nextLine();
            try {
                LocalDate dob = LocalDate.parse(input, formatter);
                return dob; 
            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
	}
	
	static int getAge(LocalDate dob) {
		LocalDate today = LocalDate.now();
		Period p = Period.between(dob, today);
		return p.getYears();
	}
	
	static int getMaxHeartRate(int age) {
		int MHR = 220 - age;
		return MHR;
	}
	
	static double getAvgHeartRate(int MHR, int RHR) {
		double AHR = MHR - RHR;
		return AHR;
	}
	
	static String targetHeartRange(float LB, float UB, int RHR, double AHR) {
		double LBTHR = (AHR*LB) + RHR;
		double UBTHR = (AHR*UB) + RHR;
		return "The Target Heart Range is Between " + LBTHR + " and " + UBTHR;
	}

}
