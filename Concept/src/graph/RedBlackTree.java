package graph;

public class RedBlackTree<K extends Comparable<K>, V> {

	private static final boolean RED = true;
	private static final boolean BLACK = false;

	public RedBlackTree() {
	}

	private class Node {
		private K key;
		private V value;
		private Node left, right;
		private boolean color;

		public Node(K k, V v, boolean color) {
			this.key = k;
			this.value = v;
			this.color = color;
		}
	}

	private Node root;

	private Node insert(Node node, K k, V v) {
		if (node == null) {
			return new Node(k, v, RED);
		}
		int cmp = k.compareTo(node.key);
		if (cmp < 0) {
			node.left = insert(node.left, k, v);
		} else if (0 < cmp) {
			node.right = insert(node.right, k, v);
		} else {
			node.value = v;
		}

		if (isRed(node.right) && !isRed(node.left)) {
			node = rotateLeft(node);
		}
		if (isRed(node.left) && isRed(node.left.left)) {
			node = rotateRight(node);
		}
		if (isRed(node.left) && isRed(node.right)) {
			filpColors(node);
		}
		return node;
	}

	public void insert(K k, V v) {
		root = insert(root, k, v);
		root.color = BLACK;
	}

	private Node search(Node node, K k) {
		if (node == null) {
			return null;
		}
		int cmp = k.compareTo(node.key);
		if (cmp < 0) {
			return search(node.left, k);
		} else if (0 < cmp) {
			return search(node.right, k);
		} else {
			return node;
		}
	}

	public Node search(K k) {
		return search(root, k);
	}

	private Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private void filpColors(Node h) {
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
	}

	private boolean isRed(Node x) {
		if (x == null) {
			return false;
		}
		return x.color = RED;
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}

	public void inOrder() {
		System.out.print("In-order: ");
		inOrder(root);
		System.out.println();
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
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