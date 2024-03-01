package prog10_1_soln.employeebst;

import java.util.Comparator;



public class EmployeeBST {
	/** The tree root. */
	private Node root;
	private Comparator<Employee> nameComparator;

	EmployeeBST(Comparator<Employee> nameComparator){
		this.nameComparator=nameComparator;
		root=null;
	}
	

	
	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
	
	
	
	public boolean find(Employee x) {
		if(x==null) return false;
		return find(x,root);
	}
	private boolean find(Employee x, Node n){
		if(n == null) return false;
		if(n != null && n.element.equals(x)) return true;
		return (nameComparator.compare(x,n.element) < 0) ?
				find(x,n.left) :
				find(x,n.right);
		
	}

	public void insert(Employee x) {
		if (root == null) {
			root = new Node(x, null, null);
		}
		else {
			Node n = root;
			boolean inserted = false;
			while(!inserted){
				if(nameComparator.compare(x,n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}
				
				else if(nameComparator.compare(x,n.element)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
				
			}

		}
	}

	

	private class Node {

		// Constructors
		Node(Employee theElement) {
			this(theElement, null, null);
		}

		Node(Employee element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
		public String toString() {
			return element.toString();
		}
		private Employee element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
}