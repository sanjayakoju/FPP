package lesson6_inner;

public class TestOuterStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			OuterStaticDemo.MyStaticNestedClass cl = new OuterStaticDemo.MyStaticNestedClass(); //OK
			OuterStaticDemo m = new OuterStaticDemo();
			//the following is illegal-- compiler error
	//OuterStaticDemo.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();
			OuterStaticDemo.MyStaticNestedClass cl2 =  new OuterStaticDemo.MyStaticNestedClass();	


	}

}
