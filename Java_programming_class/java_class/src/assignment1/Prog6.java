package assignment1;

import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the number");
			arr[i] = scan.nextInt();
		}
		System.out.print(min(arr));
	}
	
	static int min(int arrayOfInts[]) {
		int min = arrayOfInts[0];
		for(int i=1;i<arrayOfInts.length;i++) {
			if (arrayOfInts[i] < min) {
				min = arrayOfInts[i];
			}
		}
		return min;
	}
}
