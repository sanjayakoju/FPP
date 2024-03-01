package lesson3.staticdemo;
           
public class StaticExample {
  //  int count = 0;
	static  int count=0;
   // int m = 50;
	StaticExample() { ++count;}
    public int getCount(){return count;}  
 
	public static void main(String[] args) {
		// Demo code for static member
		
		StaticExample instance = null;
		for (int i = 0; i < 10; ++i) {
			instance = new StaticExample();
		}
		
		System.out.println("Number of instances so far =" + instance.getCount());
		//System.out.println(StaticExample.count);

	}

}
