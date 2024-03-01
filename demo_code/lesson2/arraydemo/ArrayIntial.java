package lesson2.arraydemo;

import java.util.Arrays;

public class ArrayIntial {
	public static void main(String args[]) {
		//Array Initialization
		int[] somePrimes = {2, 3, 5, 7, 9, 11};
		String[] names = {"Bob", "Harry", "Sue"};
		System.out.println("Names : " + Arrays.toString(names));
		System.out.println("Primes : " + Arrays.toString(somePrimes));
		
		
		String[] favoriteTeams = new String[2];
	//	favoriteTeams = {"Sonics", "Mets"}; // Compilation Error
		
		
		  String[] favoriteTeams1 = new String[2];
			favoriteTeams1 = new String[]{"Sonics", "Mets","Bats"};  //No Compilation Error
			System.out.println(Arrays.toString(favoriteTeams1));
			
			// There is no need of Array reference, passing array values can make use of Anonymous array
			System.out.println("Anonumous Array : " + Arrays.toString(new int[] { 17, 19, 23, 29 }));
	} 
}


