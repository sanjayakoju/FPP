package assignment11;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		HashMap<Key, Student> temp = new HashMap<>();
		for (Student s : students) {
			if (s != null) {
				temp.put(new Key(s.getFirstName(), s.getLastName()), s);
			}
		}
		return temp;
	}

	public static double computeAverageGPA(HashMap<Key, Student> maps) {
		// implements
		double average = 0.0;
		int count = 0;
		double sum = 0.0;
		Set<Key> keys = maps.keySet();
		for (Key key : keys) {
			Student s = maps.get(key);
			if (s.getGpa() != 0) {
				sum = sum + s.getGpa();
			}
			count++;
		}
		average = sum / count;
		return average;
	}
}
