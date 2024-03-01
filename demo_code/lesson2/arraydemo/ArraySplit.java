package lesson2.arraydemo;

import java.util.Arrays;

public class ArraySplit {

	
	public static void main(String[] args) {
		String s = "hello,how,are,you,today";
		//String s = "hello how,are,you,today";
		//String[] parsedVals =s.split(",| ");
		String[] parsedVals =s.split(","); // Delimiter only comma
		for(String x: parsedVals) {
			System.out.println(x);
					
	}
		System.out.println(Arrays.toString(parsedVals));
		String t = "Hello,strings can be fun. They have many uses";
		String[] result = t.split(",|\\.| ");  // Delimiters - commma, space and dot
		System.out.println(Arrays.toString(result));
		
	}
}
