package assignment3.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionProg3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = {3,4,61,5,6,78,12,14};
		Arrays.sort(arr);
		System.out.println("Array After Sorting");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Enter a number to find in Array");
		int input = scanner.nextInt();
		System.out.println(search(arr, input));
	}
	
	public static int search(int arr[], int input) {
		int left = 0;
		int right = arr.length-1;
		return binarySearch(arr, input, left, right);
	}
	
	public static int binarySearch(int arr[],  int input, int left, int right) {
		int midIndex = left + right;
		if(arr.length == 0 || midIndex > arr.length -1) {
			System.out.println("Stop");
			return -1;
		} else {
			if (arr[midIndex] == input) {
				return midIndex;
			} else if (input > arr[midIndex]) {
				left = midIndex + 1;
				right = arr.length -1;
				return binarySearch(arr, input, left, right);
			} else {
				right = midIndex -1;
				return binarySearch(arr, input, left, right);
			}
		}
	}
}
