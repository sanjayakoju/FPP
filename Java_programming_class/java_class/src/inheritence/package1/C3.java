package inheritence.package1;

public class C3 extends C1 {

	public static void main(String[] args) {
		C1 c1 = new C1();
		int a = c1.w;
		int b = c1.x;
		int c = c1.y;
		
		// Can not access a because of Private access
		//int d = c1.z;
		
		c1.m();
	}
}
