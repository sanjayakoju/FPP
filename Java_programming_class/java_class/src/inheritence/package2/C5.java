package inheritence.package2;

import inheritence.package1.C1;

public class C5 {

	public static void main(String[] args) {
		C1 c1 = new C1();
		int a = c1.w;
		
		// Can not access because protected in different package
		//int b = c1.x;
		
		// Cannot access because default in different package
		//int c = c1.y;
	
		// Can not access a because of Private access
		//int d = c1.z;
		
		// Cannot access protected method in different package
		//c1.m();
	}
}