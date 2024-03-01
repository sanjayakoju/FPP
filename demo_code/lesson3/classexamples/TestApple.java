package lesson3.classexamples;

import java.util.ArrayList;
import java.util.List;

public class TestApple {

	public static void main(String[] args) {
	 TestApple ta = new TestApple();
		Apple a1 = new Apple();
		System.out.println(a1);
		Apple a2 = new Apple("Green",0.56,1.3);
		System.out.println(a2);
		Apple[] arr = new Apple[5];
		arr[0]= a1;
		arr[1] = a2;
		arr[2] = new Apple();
		arr[3] = new Apple("Red",0.56,1.5);
		arr[4] = new Apple("Yellow",1.2,2.0);
		double sum = 0.0;
		for(Apple ob : arr){
			System.out.println(ob);
			sum += ob.getPrice();
		}
		System.out.println("Toatal Price : " + sum);
		System.out.println("Toatal weight : " + sumWeight(arr));
		
		
	}
	
	public  static double sumWeight(Apple[] list){
		double sum = 0.0;
		for(Apple ob:list){
			sum+=ob.getWt();
		}
		return sum;
	}

}
