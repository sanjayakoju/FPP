package lesson11.api;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> productMap = new HashMap<Integer,String>();
		productMap.put(1, "Keys");
		productMap.put(4, "Books");
		productMap.put(3, "Systems");
		productMap.put(7, "Mobile");
		productMap.put(7, "Samsung");
		productMap.put(7, "Samsung1");
		
		productMap.put(null, "Apple");
		productMap.put(null, "AppleMac");
		System.out.println(productMap);
		
		System.out.println(productMap.containsKey(4));
		System.out.println(productMap.get(null));
		System.out.println(productMap.containsValue("Books"));
		
		
		
		
	/*	HashSet<String> stateSet = new HashSet<String>();
		stateSet.add ("CA");
		stateSet.add ("WI");
		stateSet.add ("NY");
		stateSet.add (null);
		
		if (stateSet.contains("PB"))  if CA, it will not add but shows following message
		     System.out.println("Already found");
		else
		    stateSet.add("PB");
		 System.out.println(stateSet);
		 
		 HashSet<Integer> numberSet = new HashSet<Integer>();
		 numberSet.add(10);
		 numberSet.add(-12);
		 numberSet.add(15);
		 numberSet.add(16);
		 numberSet.remove(15);
		 boolean s = numberSet.add(19);
		 for(Integer num:numberSet)
	            System.out.println("Value : " + num);
		 System.out.println(s);*/
		 
	}

}
