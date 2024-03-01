package mid.term.test;

public class CountVowel {

	static int vowelCount(String st) {
		int counter = 0;
		if (st == null || st.equals("")) {
			return -1;
		} else  {
			char c = st.charAt(0);
			if(c == 'a' || c == 'e' || c== 'i' || c=='o' || c=='u') {
				counter = counter + 1;
			}
			return counter + vowelCount(st.substring(1));
		}
	}
	
	public static void main(String[] args) {
		String st = "Sanjaya";
		System.out.println(vowelCount(st));
	}
}
