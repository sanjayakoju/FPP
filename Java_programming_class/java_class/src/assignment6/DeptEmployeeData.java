package assignment6;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000,LocalDate.of(1979,1,2)); 
		Professor p2 = new Professor("Anna",45000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}
	
	public static void main(String[] args) {
		// Task A
		DeptEmployee deptEmployee[] = getDeptData();
		Arrays.sort(deptEmployee, new NameComparator());
		System.out.println("Using Outside Class Comparator");
		System.out.println(Arrays.toString(deptEmployee));
		
		// Task B
		DeptEmployeeData deptEmpDataObj = new DeptEmployeeData();
		Arrays.sort(deptEmployee, deptEmpDataObj.getNameComparator());
		System.out.println("Using Inner Class Comparator");
		System.out.println(Arrays.toString(deptEmployee));
		
		// Task C
		deptEmpDataObj.sortName(deptEmployee);
		System.out.println("Using Local Class Comparator");
		System.out.println(Arrays.toString(deptEmployee));
		
		// Task D Using Anonymous Class
		Arrays.sort(deptEmployee, new Comparator<DeptEmployee>() {

			@Override
			public int compare(DeptEmployee o1, DeptEmployee o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		});
		System.out.println("Using Anonymous Class Comparator");
		System.out.println(Arrays.toString(deptEmployee));
		
		// Task E Using Lambda
		Arrays.sort(deptEmployee, (o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()));
		System.out.println("Using Lambda");
		System.out.println(Arrays.toString(deptEmployee));
	}
	
	// Task B Inner Class
	private class NameComp implements Comparator<DeptEmployee> {

		@Override
		public int compare(DeptEmployee o1, DeptEmployee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	public NameComp getNameComparator() {
		return new NameComp();
	}
	
	// Task C Local Class
	private void sortName(DeptEmployee[] deptEmployee) {
		class NameCompa implements Comparator<DeptEmployee>{

			@Override
			public int compare(DeptEmployee o1, DeptEmployee o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		}
		Arrays.sort(deptEmployee, new NameCompa());
	}

}
