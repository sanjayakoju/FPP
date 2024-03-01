package assignment1;

public class Prog1 {
	
	static void sum(int x, int y, String type) {
		if (type.equals("first")) {
			int randomNumber1 = RandomNumbers.getRandomInt(x, y);
			System.out.println("Random Integer first : "+randomNumber1);
			System.out.println(Math.pow(Math.PI, randomNumber1));
		} else if (type.equals("second")) {
			int randomNumber2 = RandomNumbers.getRandomInt(x, y);
			System.out.println("Random Integer second : "+randomNumber2);
			System.out.println(Math.pow(randomNumber2, Math.PI));
		}
	}

	public static void main(String[] args) {
		sum(1, 9, "first");  
		sum(3, 14, "second");
	}
}
