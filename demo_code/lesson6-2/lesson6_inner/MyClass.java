package lesson6_inner;

public class MyClass {
	private String s = "hello";
	public static void main(String[] args){
		new MyClass();
	}
	MyClass() {
		MyInnerClass myInner = new MyInnerClass();
		System.out.println(myInner.intval);
		myInner.innerMethod();
	}
	private class MyInnerClass {
		private int intval = 3;
		//private static int k = 10; // From JDK 16 no errors on static field
		private void innerMethod(){
			System.out.println(s);
			//k= k + 10;
			//System.out.println("k = " + k);
		}
	}
}

