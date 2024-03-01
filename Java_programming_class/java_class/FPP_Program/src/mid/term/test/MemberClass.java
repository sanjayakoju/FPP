package mid.term.test;

import java.util.Arrays;
import java.util.Comparator;

public class MemberClass {
	
	private String name;
	private String address;
	
	public MemberClass(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "MemberClass [name=" + name + ", address=" + address + "]";
	}

	public MemberClass() {
		InnerClass ob = new InnerClass();
	}
	
	// Using Inner Class
	public static class InnerClass implements Comparator<MemberClass> {

		@Override
		public int compare(MemberClass o1, MemberClass o2) {
			// TODO Auto-generated method stub
			return o2.name.compareTo(o1.name);
		}
		
	}
	
	public static void main(String[] args) {
		MemberClass ob[] = {new MemberClass("Sanjaya", "Bhaktapur"), new MemberClass("Rahul", "Biratnagar")};
	    
	    // Anonymous Inner Class
	    Arrays.sort(ob, new Comparator<MemberClass>() {

			@Override
			public int compare(MemberClass o1, MemberClass o2) {
				// Compare with Name
				return o1.name.compareTo(o2.name);
			}
		});
	    System.out.println("Using Anonymous Class");
	    System.out.println(Arrays.toString(ob));
	    
	    // Using Inner Class (Descending)
	    Arrays.sort(ob, new InnerClass());
	    System.out.println("Using Inner Class");
	    System.out.println(Arrays.toString(ob));
	    
	    // Using Lambda Sorting by Address
	    Arrays.sort(ob, (ob1,ob2) -> {
	    	return ob1.address.compareTo(ob2.address);
	    });
	    System.out.println("Using Lambda Sorting by Address");
	    System.out.println(Arrays.toString(ob));
	}

}
