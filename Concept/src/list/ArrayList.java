package list;

public class ArrayList {

	private int size;
	private Object[] elementData;
	
	public ArrayList() {
		
		this.size = 0;
		this.elementData = new Object[100];
	}

	public boolean addFirst(Object element) {
		
		return add(0, element);
	}
	
	public boolean addLast(Object element) {
	
		elementData[size++] = element;
		return true;
	}

	public boolean add(int index, Object element) {

		for(int i=size-1; index<=i; i--)
			elementData[i+1] = elementData[i];
		elementData[index] = element;
		size++;
		return true;
	}
	
	public String toString() {
		
		String str = "[";
		for(int i=0; i<size; i++) {
			str += elementData[i];
			if(i<size-1)
				str += ", ";
		}
		return str + "]";
	}
	
	public void remove(int index) {
		
	}
}