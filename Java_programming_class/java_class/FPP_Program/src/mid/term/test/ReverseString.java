package mid.term.test;

public class ReverseString {

	static void reverseString(String st) {
		if(st == null || st.equals("")) {
			return;
		} else {
			reverseString(st.substring(1));
			System.out.print(st.charAt(0));
		}
		
	}
	
	public static void main(String[] args) {
		String st = "Name";
		reverseString(st);
	}
}
