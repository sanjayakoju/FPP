package inheritence.package2;

import inheritence.package1.C1;

public class C4 extends C1 {

	public static void main(String[] args) {
		C4 c4 = new C4();
		int a = c4.w;
		
		// While protected members can be accessed anywhere in the same package and outside package
		// only in its child class and using the child class's reference variable only, not on the 
		// reference variable of the parent class
	    int b = c4.x;
		
		// Cannot access default in different package
		//int c = c1.y;
	
		// Can not access a  Private access
		//int d = c1.z;
		
		// Can access protected method in different package
		c4.m();
	}
}
