package assignment9.prob2;


//User Implementation of Stack 
interface Stack1 {
	public void push(int data);

	public int pop();

	public int peek();

	public boolean isEmpty();

	public int size();
}


public class LinkedListStack implements Stack1 {
	 private Node top;
	 private int nodesCount;
	
	public LinkedListStack() {
		 this.top = null;
	     this.nodesCount = 0;
	}
	
	class Node {
		 int data; 
		 Node next;  
	}

	@Override
	public void push(int data) {
	     Node node = new Node();
	     
	     if (node == null)
	     {
	         System.out.println("Heap Overflow");
	         return;
	     }

	     System.out.println("Inserting " + data);

	     node.data = data;
	     node.next = top;
	     top = node;
	     this.nodesCount += 1;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
	     if (isEmpty())
	     {
	         System.out.println("Stack Underflow");
	         System.exit(-1);
	     }
	     int top = peek();
	     this.nodesCount -= 1;
	     this.top = (this.top).next;

	     return top;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			return top.data;
		} else {
			return -1;
		}	
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.nodesCount;
	}

}
