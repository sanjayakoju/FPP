package assignment9.prob2;

public class MainStack {

	public static void main(String[] args) {
		LinkedListStack ob = new LinkedListStack();
		System.out.println("Is Empty : "+ob.isEmpty());
		ob.push(12);
		ob.push(22);
		ob.push(33);
		System.out.println("Stack Pop : "+ob.pop());
		System.out.println("Stack Peek : "+ob.peek());
		System.out.println("Is Empty : "+ob.isEmpty());
		System.out.println("Size : "+ob.size());
	}
}
