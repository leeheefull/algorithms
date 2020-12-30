package list;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;

	// ---------------------------------------
	public class Node {
		private Object data;
		private Node next;

		public Node() {
			this.data = null;
			this.next = null;
		}

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}
	// ---------------------------------------

	public LinkedList() {
		this.size = 0;
	}

	// Add front of the list
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;

		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	// Add behind of the list
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// Find node by index
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// Add data
	public void add(int index, Object input) {
		if (index == 0) {
			addFirst(input);
		} else {
			Node tmp1 = node(index - 1);
			Node tmp2 = tmp1.next;

			Node newNode = new Node(input);
			tmp1.next = newNode;
			newNode.next = tmp2;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}

	// Print linked list
	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node tmp = head;
		String str = "[";

		while (tmp.next != null) {
			str += tmp.data + " -> ";
			tmp = tmp.next;
		}
		str += tmp.data;
		return str + "]";
	}

	// Remove front of the list
	public Object removeFirst() {
		Node tmp = head;
		head = head.next;
		Object returnData = tmp.data;
		tmp = null;
		size--;
		return returnData;
	}

	// Remove data
	public Object remove(int index) {
		if (index == 0) {
			return removeFirst();
		}
		Node tmp = node(index - 1);
		Node toDoDeleted = tmp.next;

		tmp.next = tmp.next.next;
		Object returnData = toDoDeleted.data;

		if (toDoDeleted == tail) {
			tail = tmp;
		}
		toDoDeleted = null;
		size--;
		return returnData;
	}

	// Remove behind of the list
	public Object removeLast() {
		return remove(size - 1);
	}

	// get list size
	public int size() {
		return size;
	}

	// get data to the index
	public Object get(int index) {
		Node tmp = node(index);
		return tmp.data;
	}

	// get index to the data
	public int indexOf(Object data) {
		Node tmp = head;
		int index = 0;

		while (tmp.data != data) {
			tmp = tmp.next;
			index++;
			if (tmp == null) {
				return -1;
			}
		}
		return index;
	}

	public ListIterator listIterator() {
		return new ListIterator();
	}

	// -------------------------------------
	public class ListIterator {

		private Node next;
		private Node lastReturned;
		private int nextIndex;

		public ListIterator() {
			this.next = head;
			this.nextIndex = 0;
		}

		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;

			return lastReturned.data;
		}

		public boolean hasNext() {
			return nextIndex < size();
		}

		public void add(Object input) {
			Node newNode = new Node(input);

			if (lastReturned == null) {
				head = newNode;
				newNode.next = next;
			} else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}

		public void remove() {
			if (nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(nextIndex - 1);
			nextIndex--;
		}
	}
	// -------------------------------------
}