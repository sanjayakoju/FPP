package lesson8.listandpolymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GnericRestriction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ClosedCurve> objects = new ArrayList<>();
		objects.add(new Rectangle(5,7));
		objects.add(new Rectangle(2,9));
		objects.add(new Circle(6));
		System.out.println(objects.size());
		
		List<Circle> cir = new ArrayList<>();
		cir.add(new Circle(7));
		cir.add(new Circle(8));
		// Restriction Rule - 2 cannot assign subtype list to your supertype list
	//	objects = cir;
		

	}

}
