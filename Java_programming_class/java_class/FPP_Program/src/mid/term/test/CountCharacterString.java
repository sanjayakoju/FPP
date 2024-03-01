 package mid.term.test;

public class CountCharacterString {
	
	static int countChar(String st) {
		if(st == null || st.equals("")) {
			return 0;
		}
		
		return 1 + countChar(st.substring(1));
	}

	public static void main(String[] args) {
		System.out.println(countChar("Sanjaya"));
	}
}
