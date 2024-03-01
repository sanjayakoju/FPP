package assignment3.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,44,33,22,55,77,12,14};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Data in Array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a number to search");
		int input = scanner.nextInt();
		System.out.println(search(arr, input)); 
	}
	
	public static int search(int arr[], int input) {
		return linearSearch(arr, input, 0);
	}
	
	public static int linearSearch(int arr[], int input, int pos) {
		if(arr.length == 0 || pos >= arr.length) {
			return -1;
		} else if (pos <= arr.length) {
			if (arr[pos] == input) {
				return pos;
			} else {
				return linearSearch(arr, input, ++pos);
			}
		} else {
			return -1;
		}
	}
}
