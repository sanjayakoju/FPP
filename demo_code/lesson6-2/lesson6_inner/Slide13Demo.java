package lesson6_inner;

class ClassA {
    class InnerClassA {
     }
}


public class Slide13Demo {

	public static void main(String[] args) {
		/*ClassA a = new ClassA();
		ClassA.InnerClassA innerA = a.new InnerClassA(); *///ok
		/*ClassA.InnerClassA innerA =
				   new ClassA.InnerClassA();*/  //illegal
		// To fix it
		ClassA.InnerClassA innerA =
				   new ClassA().new InnerClassA();  //illegal

	}

}
