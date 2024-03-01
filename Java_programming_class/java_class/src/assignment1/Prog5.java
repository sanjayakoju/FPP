package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array 1");
		int len1 = scanner.nextInt();
		int arr1[] = new int[len1];
		for(int i=0;i<len1;i++) {
			System.out.println("Enter a number");
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the size of Array 2");
		int len2 = scanner.nextInt();
		int arr2[] = new int[len2];
		for(int j=0;j<len2;j++) {
			System.out.println("Enter a number");
			arr2[j] = scanner.nextInt();
		}
		
		Prog5 ob = new Prog5();
		System.out.println(Arrays.toString(ob.combine(arr1, arr2)));
	}
	
	public int[] combine(int a[], int b[]) {
		int returnArr[] = new int[a.length + b.length];
		int counter = 0;
		for(int i=0;i<a.length;i++) {
			returnArr[i] = a[i];
			counter++;
		}
		for(int j=0;j<b.length;j++,counter++) {
			returnArr[counter] = b[j];
		}

		return returnArr;
	}
}
