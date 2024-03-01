package linkedList;


public class Node {

	Node prev;
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public String toString() {
		return "Data = "+data;
	}
}
