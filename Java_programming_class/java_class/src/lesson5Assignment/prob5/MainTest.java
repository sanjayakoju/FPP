package lesson5Assignment.prob5;

public class MainTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer("Dell", "Intel", 16, 2.14);
		Computer computer2 = new Computer("Dell", "Intel", 16, 2.14);
		Computer computer3 = new Computer("Acer", "Intel", 16, 2.14);
		Computer computer4 = new Computer("HP", "Intel", 16, 2.14);
		
		System.out.println(computer1.toString());
		
		System.out.println(computer1.equals(computer2));
		System.out.println(computer1.equals(computer4));
	}
}
