class Node {
	public int value;
	public Node left;
	public Node right;
	
	public Node(int d) {
		this.value = d;
	}
}

public class binarySearchTree {
	public static Node root;
	
	// inserts int into bst
	public void insert(int value){
		Node n = new Node(value);
		
		if (root == null) {
			root = n;
			return;
		}
		
		insertRec(root, n);
	}

	private void insertRec(Node latestRoot, Node node){
		if (latestRoot.value > node.value) {	
			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRec(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRec(latestRoot.right, node);
			}
		}
	}
	
	// finds minimum value in bst
	public int findMinimum() {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.left != null) {
			currNode = currNode.left;
		}
		return currNode.value;
	}
	
	// finds maximum value in bst
	public int findMaximum() {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.right != null) {
			currNode = currNode.right;
		}
		return currNode.value;
	}
	
	public static void printInOrder(){
		printInOrderRec(root);
		System.out.println("");
	}
	
	private static void printInOrderRec(Node currRoot){
		if (currRoot == null) {
			return;
		}
		printInOrderRec(currRoot.left);
		System.out.println(currRoot.value+", ");
		printInOrderRec(currRoot.right);
	}
	
	public static void main(String[] args) {
		//make a root
		Node root = new Node(5);
		
		//make a binarySearchTree
		binarySearchTree bst = new binarySearchTree();
		
		//insert value
		bst.insert(4);
		
		//insert a bunch of values
		int[] numbers = new int[]{3,1,2,5,6,0,7};
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			bst.insert(numbers[i]);
		}
		
		int x = bst.findMinimum();
		int y = bst.findMaximum();
		System.out.println(x);
		System.out.println(y);
		printInOrder();
		
	}

}
