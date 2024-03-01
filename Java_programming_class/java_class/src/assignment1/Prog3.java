package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		String arr[] = new String[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the string");
			arr[i] = scan.next();
		}
		
		for(int i=0;i<arr.length;i++) {
			String st = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(st.equals(arr[j])) {
					arr[i] = null;
				}
			}
		}
		int count = 0;
		for(String m: arr) {
			if(m != null) {
				count++;
			}
		} 
		String noDupArray[] = new String[count];
		int idx = 0;
		for(int i=0;i<arr.length;i++) {
			String st = arr[i];
			if(st != null) {
				noDupArray[idx] = arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(noDupArray));
	}
}
