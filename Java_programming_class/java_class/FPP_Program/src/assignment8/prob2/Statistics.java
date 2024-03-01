package assignment8.prob2;


import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		//implement
		//compute sum of all salaries of people in aList and return
		double sum = 0;
		for (int i=0;i<aList.size();i++) {
			sum = sum + aList.get(i).getSalary();
		}
		return sum;
		
	}
}
