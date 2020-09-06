package list;

public class ArrayList {

	private int size;
	private Object[] elementData;
	
	// Init
	public ArrayList() {
		this.size = 0;
		this.elementData = new Object[100];
	}

	// Add front of the list
	public boolean addFirst(Object element) {
		add(0, element);
		return true;
	}
	
	// Add behind of the list
	public boolean addLast(Object element) {
		elementData[size++] = element;
		return true;
	}

	// Add element to the index
	public boolean add(int index, Object element) {
		for(int i=size-1; index<=i; i--)
			elementData[i+1] = elementData[i];
		elementData[index] = element;
		size++;
		return true;
	}
	
	// Print array list
	public String toString() {
		String str = "[";
		for(int i=0; i<size; i++) {
			str += elementData[i];
			if(i<size-1)
				str += ", ";
		}
		return str + "]";
	}
	
	// Remove element located at index
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i=index; i<=size-1; i++)
			elementData[i] = elementData[i+1];
		
		size--;
		elementData[size] = null;
		return removed;
	}
	
	// Remove front of the list
	public Object removeFirst() {
		return remove(0);
	}
	
	// Remove behind of the list
	public Object removeLast() {
		return remove(size-1);
	}

	// Get element to the index
	public Object get(int index) {
		return elementData[index];
	}

	// Print array list size 
	public int size() {
		return size;
	}

	// Find element and get the index
	public int indexOf(Object o) {
		for(int i=0; i<size; i++)
			if(o.equals(elementData[i]))
				return i;
		
		return -1;
	}
	
	// Loop object
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	// ----------------------------------------------
	
	class ListIterator {
		
		private int nextIndex;
		
		// Init
		public ListIterator() {
			this.nextIndex = 0;
		}
		
		// Return next index
		public Object next() {
			return elementData[nextIndex++];
		}

		// Check if there is element at the next index
		public boolean hasNext() {
			return nextIndex<size();
		}

		// Return previous index
		public Object previous() {
			return elementData[--nextIndex];
		}

		// Check if there is element at the behind index
		public boolean hasPrevious() {
			return 0<nextIndex;
		}

		// Add element at list 
		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}

		// Remove element at List
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}