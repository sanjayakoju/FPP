package mid.term.test;

public class LinearSearch {
	
	private static int linearSearch(Object[] items, Object target, int posFirst) {
		if (posFirst == items.length) {
		return -1;
		} else if (target.equals(items[posFirst])) {
		return posFirst;
		} else {
		return linearSearch(items, target, posFirst + 1);
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] i = { 10,20,15,12,65,50};
		Object[] s = {"java","c#","SE","UML","WAP"};
		// Utility Function Support from the client side - possible arguments
		System.out.println("Searching of 12 in the list : " + linearSearch(i,12, 0));
		System.out.println("Searching of FPP in the list : " + linearSearch(s, "java", 0));

	}
}
