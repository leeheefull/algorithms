package graph;

public class BinaryTree<K extends Comparable<K>, V> {

	public BinaryTree() {}

	private class Node {
		
		private K key;
		private V value;
		private Node left, right;
		
		public Node(K k, V v) {
			this.key = k;
			this.value = v;
		}		
	}

	private Node root;
	
	private Node insert(Node node, K k, V v) {
		if (node == null) return new Node(k, v);
		int cmp = k.compareTo(node.key);
		if (cmp < 0) node.left = insert(node.left, k, v);
		else if (cmp > 0) node.right = insert(node.right, k, v);
		else node.value = v;
		return node;
	}
	
	public void insert(K k, V v) {
		root = insert(root, k, v);
	}
	
	private Node search(Node node, K k) {
		if (node == null) return null;
		int cmp = k.compareTo(node.key);
		if (cmp < 0) return search(node.left, k);
		else if (cmp > 0) return search(node.right, k);
		else return node;
	}
	
	public Node search(K k) {
		return search(root, k);
	}
	
	private void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	
	public void inOrder() {
		System.out.print("In-order : ");
		inOrder(root);
		System.out.println("");		
	}
	
	private int height(Node node) {
		if(node == null) return -1;
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
	public int height() {
		return height(root);
	}

	public K getRootKey() {
		return root.key;
	}
	
	public V getValue(Node node) {
		return node.value;
	}	
}