package lesson2.arraydemo;

import java.util.Arrays;
import java.util.Collections;

public class ArrayCopySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] smallPrimes = { 2, 3, 5, 7, 11};
		int[] copy = new int[4];
		int[] copy1 = new int[4];
		System.arraycopy(smallPrimes, 0, copy, 0, 4);
		System.out.println(Arrays.toString(copy));		
		int[] luckyNums = {350, 400, 150, 200, 250};
		System.arraycopy(smallPrimes, 1, luckyNums, 2, 2);
		System.out.println(Arrays.toString(luckyNums));
		// Array Copy from 0 index to length specified
		int[] temp = Arrays.copyOf(smallPrimes, 4); // pass original array and length
		System.out.println(Arrays.toString(temp));
		
		// Array Sort
		Arrays.sort(luckyNums);
		System.out.println("Sorted List : "+Arrays.toString(luckyNums));

		String names[] = {"Java","Android","Kotlin","C++","SQLite"};
		Arrays.sort(names);
		System.out.println("Natural order Sorted List : "+Arrays.toString(names));
		Arrays.sort(names,Collections.reverseOrder());
		System.out.println("Reversed Sorted List : "+Arrays.toString(names));
	}

}
