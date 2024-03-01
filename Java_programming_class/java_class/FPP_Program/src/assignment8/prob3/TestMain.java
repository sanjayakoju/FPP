package assignment8.prob3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		// Implement a body
		List<Marketing> rtnList = new ArrayList<>();
		for (int i=0;i<list.size();i++) {
			if(list.get(i).getSalesamount() > 1000) {
				rtnList.add(list.get(i));
			}
		}
		return rtnList;
	}

	public static void main(String[] args) {
		List<Marketing> list = new ArrayList<>();
		// A
		list.add(new Marketing("Sanjaya", "Dell", 1000));
		list.add(new Marketing("Jenish", "HP", 900));
		list.add(new Marketing("Razyv", "Acer", 1200));
		list.add(new Marketing("Binod", "Samsung", 1500));
		list.add(new Marketing("Rahul", "Samsung", 1500));

		// B
		list.remove(3);
		// C
		System.out.println("Size of List : " + list.size());
		System.out.println("Before Comparator");
		System.out.println(list);

		SaleAmtComparator saleSAmtComparator = new SaleAmtComparator();
		Collections.sort(list, saleSAmtComparator);
		System.out.println("After Comparator");
		System.out.println(list);
		
		// F
		Collections.sort(list,(o1,o2)-> o1.getEmployeename().compareTo(o2.getEmployeename()));
		System.out.println("Sorting Employee Name");
		System.out.println(list);
		System.out.println("Sale more than 1000");
		List<Marketing> saleMoreThan100 = listMoreThan1000(list);
		Collections.sort(saleMoreThan100, saleSAmtComparator);
		System.out.println(saleMoreThan100);
	}
}
