package hashtable;

import java.util.Hashtable;

public class HasMapPrac {

	public static void main(String[] args) {
		Hashtable<Integer, String> hTable = new Hashtable<Integer, String>();
        hTable.put(1, "Java");
        hTable.put(5, "C++");
        hTable.put(3, "CoralDraw");
        hTable.put(4, "SE");
        System.out.println(hTable);
        System.out.println(hTable.get(5));
	}
}