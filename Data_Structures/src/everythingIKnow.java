
public class everythingIKnow {
	
	//the main functions of a linkedList that I can writeup from memory
	class linkedListNode {
		int data;
		linkedListNode next;
		
		public linkedListNode(int n){
			data = n;
		}
		
		//appends a node from the list
		void appendToTail(int d) {
			linkedListNode end = new linkedListNode(d);
			linkedListNode n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
		
		//deletes a node from a list
		linkedListNode deleteFromList(linkedListNode head, int d) {
			linkedListNode n = head;
			if (head.data == d) {
				return head.next;
			}
			while (n.next != null) {
				if (n.next.data == d) {
					n.next = n.next.next;
				}
				n = n.next;
			}
			return head;
		}
		
		//reverses a linked list
		linkedListNode reverseList(linkedListNode curr) {
			linkedListNode prev = null;
			linkedListNode next = null;
			while (curr != null) {
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			return prev;
		}
	}
	
	// node used for queues and stacks
	public class sqNode {
		Object data;
		sqNode next;
		
		public sqNode(Object d) {
			data = d;
		}
	}
	
	//main functions of a stack that I can write from memory
	//works as first-in/first-out data storage
	public class stack {
		sqNode top;
		
		//add item
		void push (Object item) {
			sqNode t = new sqNode(item);
			t.next = top;
			top = t;
		}
		
		//remove first item and return it 
		Object pop() {
			if (top != null) {
				Object item = top.data;
				top = top.next;
				return item;
			}
			return null;
		}
		
		//look at first item
		Object peek() {
			return top.data;
		}
	}
	
	//main functions of a queue that I can write from memory
	//works as last-in/last-out data storage
	public class queue {
		sqNode first, last;
		
		//add object to queue
		void enqueue(Object item) {
			if (first == null) {
				first = new sqNode(item);
				last = first;
			} else {
				last.next = new sqNode(item);
				last = last.next;
			}
		}
		
		//remove first item and return it
		Object dequeue() {
			if (first != null) {
				Object item = first.data;
				first = first.next;
				return item;
			}
			return null;
		}
	}
	
	//structure of node used in binarySearchTree
	public class bstNode {
		int value;
		bstNode left;
		bstNode right;
		
		public bstNode(int n){
			this.value = n;
		}
	}
	
	//main structure and functions of a binarySearchTree that I can write from memory
	public class binarySearchTree {
		public bstNode root;
		
		//insert a node into a binary search tree
		//if root is null insert, else pass to recursive insert function
		public void insert(int data) {
			bstNode node = new bstNode(data);
			if (root == null) {
				root = node;
				return;
			}
			insertRec(root, node);
		}
		
		// recursively searches a bst and finds appropriate insertion spot
		private void insertRec(bstNode currentNode, bstNode node) {
			if (currentNode.value > node.value) {
				if (currentNode.left == null) {
					currentNode.left = node;
					return;
				} else {
					insertRec(currentNode.left, node);
				}
			} else {
				if (currentNode.right == null) {
					currentNode.right = node;
					return;
				} else {
					insertRec(currentNode.right, node);
				}
			}
		}
		
		//finds minimum bst value
		public int findMinimum(){
			if (root == null) {
				return 0;
			}
			bstNode curr = root;
			while (curr.left != null) {
				curr = curr.left;
			}
			return curr.value;
		}
		
		//finds max bst value
		public int findMaximum(){
			if (root == null) {
				return 0;
			}
			bstNode curr = root;
			while (curr.right != null) {
				curr = curr.right;
			}
			return curr.value;
		}
		
		//find any value in a bst
		public boolean find(int n) {
			bstNode currNode = root;
			while (currNode != null) {
				if (currNode.value == n) {
					return true;
				} else if (currNode.value > n) {
					currNode = currNode.left;
				} else {
					currNode = currNode.right;
				}
			}
			return false;
		}
	}
}
