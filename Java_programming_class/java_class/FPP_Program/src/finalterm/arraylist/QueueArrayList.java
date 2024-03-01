package finalterm.arraylist;

interface Queue1 {
	
	void enqueue(int n);
	
	int deQueue();
	
	void resize();
	
	boolean isFull();
	
	boolean isEmpty();
	
	public int size();
}

public class QueueArrayList implements Queue1 {

	int arr[];
	int front;
	int rear;
	
	public QueueArrayList(int size) {
		this.arr = new int[size];
		this.front = -1;
		this.rear = 0;
	}

	@Override
	public void enqueue(int n) {
		// TODO Auto-generated method stub
		if(front == -1) {
			front++;
		}
		if (isFull()) {
			resize();
		}
		arr[rear] = n;
		rear++;
	}

	@Override
	public int deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return -1;
		}
		int rtn = arr[front];
		front++;
		return rtn;
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		int temp[] = new int[2 * arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (rear == arr.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (front == -1) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if (front != -1) {
			return rear - front;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		QueueArrayList ob = new QueueArrayList(2);
		System.out.println("Is Empty : "+ob.isEmpty());
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
//		ob.enqueue(40);
		System.out.println("Size : "+ob.size());
		System.out.println("Is Empty : "+ob.isEmpty());
//		System.out.println("Dequeue : "+ob.deQueue());
		System.out.println("Is Full : "+ob.isFull());
	}
}
