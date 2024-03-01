package lesson10.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 TreeSet<String> ts = new TreeSet<String>();
		 Set<String> s1 = new TreeSet<>();
		 TreeSet<Integer> set = new TreeSet<Integer>();
		 set.add(20);
		 set.add(10);
		 set.add(30);
		 set.add(25);
		System.out.println(set);
		boolean rs= set.add(20);
		System.out.println(rs);
		
	// set.addAll(null); // Does not allow null, throw Null Pointer Exception
	 
		 System.out.println(set);
	        ts.add("Java");
	        ts.add("Software Engineering");
	        ts.add("Visual Basic");
	        ts.add("Computer Graphics");
	       System.out.println("Min : " + set.first());
	       System.out.println("Max : " + set.last());
	        ts.remove("Java");
	     //  ts.add(null); // does not allow null value
	        System.out.println("Elements: "+ts);
	        //check is set empty?
	        System.out.println("Is set empty: "+ts.isEmpty());
	        //delete all elements from set
	        ts.clear();
	        System.out.println("Is set empty: "+ts.isEmpty());
	        ts.add("Multimedia");
	        boolean res = ts.add("Multimedia"); // Does not allows duplicate values
	        System.out.println("res = " + res);
	        ts.add("Coral Draw");
	        ts.add("Adobe Photoshop");
	        System.out.println("Size of the set: "+ts.size());
	        ts.remove("Multimedia");
	        System.out.println("Elements: "+ts);
	     	System.out.println("Accessing elements using Iterator");
	        Iterator<String> it = ts.iterator();
	        while(it.hasNext()) {
	        	String inp = it.next();
	        	System.out.println(inp);
	        }
	        
	        TreeSet<String> obj = new TreeSet();
			obj.add("Java");
				if(obj.add("Java"))	
					System.out.println(true);
				else 
				System.out.println(false);

	}

}
