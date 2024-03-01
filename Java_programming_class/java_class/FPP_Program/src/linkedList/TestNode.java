package linkedList;

public class TestNode {

	public static void main(String[] args) {
		Node h = new Node(10);
		Node n1 = new Node(20);
		
		h.next = n1;
		n1.prev = h;
		
		Node n2 = new Node(30);
		n1.next = n2;
		n2.prev = n1;
		
		Node m = new Node(40);
		m.prev = n1;
		n1.next = m;
		n2.prev = m;
		m.next = n2;
		
		System.out.println(h);
		System.out.println("Sum Using For loop in Node");
		int sum = 0;
		for(Node s = h; s!=null; s = s.next ) {
			sum = sum + s.data;
			System.out.print(s.data + " ");
		}
		System.out.print("Sum = "+sum);
		
		sum = 0;
		Node temp = h;
		System.out.println("Using While loop");
		while(temp!=null) {
			sum = sum + temp.data;
			temp = temp.next;
		}
		System.out.println("Sum Using while loop :  "+sum);
	}
}
