package finalterm.linkedList;

interface Queue1 {
	
	void enqueue(int n);
	
	int deQueue();
	
	int peek();
	
	boolean isEmpty();
	
	public int size();
	
	void display();
}

public class QueueDLinkedList implements Queue1 {
	
	Node front, rear;
	int count;
	
	class Node {
		Node prev;
		int value;
		Node next;
		public Node(Node prev, int value, Node next) {
			this.prev = prev;
			this.value = value;
			this.next = next;
		}
	}
	
	public QueueDLinkedList() {
		this.count = 0;
	}

	@Override
	public void enqueue(int n) {
		// TODO Auto-generated method stub
		Node node = new Node(null, n, null);
		// No Node in Queue
		if (front == null) {
			front = node;
			rear = node;
		}
		// Only one Node in Queue
		if(front == rear) {
			front.next = node;
			node.prev = front;
			rear = node;
		} 
		// Queue have 2 or more than Nodes
		else {
			rear.next = node;
			node.prev = rear;
		}
		count++;
	}

	@Override
	public int deQueue() {
		// TODO Auto-generated method stub
		if (front == null) {
			throw new NullPointerException("Queue is Empty");
		}
		int value = front.value;
		front = front.next;
		count--;
		return value;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (front != null) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if (front != null) {
			return front.value;
		}
		return -1;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Front "+front.value);
		Node temp = front;
		if (temp != null) {
			while(temp.next != null) {
				System.out.print(temp.value + "-->");
				temp = temp.next;
			}
			System.out.println(temp.value);
		}	
	}
	
	public static void main(String[] args) {
		QueueDLinkedList ob = new QueueDLinkedList();
		System.out.println("Is Empty : "+ob.isEmpty());
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
		ob.display();
		System.out.println("Size : "+ob.size());
		System.out.println("Is Empty : "+ob.isEmpty());
		System.out.println("Dequeue : "+ob.deQueue());
		ob.display();
		System.out.println("Peek : "+ob.peek());
	}
}
