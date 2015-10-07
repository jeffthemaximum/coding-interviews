class Node {
	public int value;
	public Node left;
	public Node right;
	
	public Node(int d) {
		this.value = d;
	}
}

public class binarySearchTree {
	public Node root;
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
