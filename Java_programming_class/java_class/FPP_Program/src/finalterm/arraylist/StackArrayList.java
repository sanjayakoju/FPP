package finalterm.arraylist;

interface Stack1 {
	
	public void push(int data);

	public int pop();

	public int peek();

	public boolean isEmpty();

	public int size();
}

public class StackArrayList implements Stack1 {
	
	int arr[];
	int top;
	public StackArrayList(int size) {
		this.arr= new int[size];
		this.top = -1;
	}
	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		if(top == arr.length - 1) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = data;
		
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int rtn = arr[top];
		top--;
		return rtn;
	}
	@Override
	public int peek() {
		// TODO Auto-generated method stub
		if (top != -1) {
			return arr[top];
		}
		return -1;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top != -1) {
			return false;
		}
		return true;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(top != -1) {
			return top +1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		StackArrayList ob = new StackArrayList(3);
		System.out.println("Is EMpty : "+ob.isEmpty());
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		System.out.println("Peek : "+ob.peek());
		System.out.println("size : "+ob.size());
		System.out.println("Pop : "+ob.pop());
		System.out.println("Is EMpty : "+ob.isEmpty());
		System.out.println("Peek : "+ob.peek());
		
		
	}

}
