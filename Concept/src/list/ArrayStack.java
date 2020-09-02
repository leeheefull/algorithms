package list;

public class ArrayStack {

	private int top;
	private int size;
	private Object[] stack;

	public ArrayStack(int size) {
		this.top = -1;
		this.size = size;
		stack = new Object[size];
	}

	public boolean isEmpty() {
		return (top==-1);
	}

	public boolean isFull() {
		return (size-1<=top);
	}

	public void push(Object item) {
		if(isFull())
			System.out.println("stack is full");
		else {
			stack[++top] = item;
			System.out.println("push: " + item);
		}
	}

	public Object pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		else{
			System.out.println("pop: " + stack[top]);
			return stack[top--];
		}
	}

	public Object peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		else {
			System.out.println("peek: " + stack[top]);
			return stack[top];
		}
	}

	public void print() {
		System.out.print("stack: ");
		for(int i=top; 0<=i; i--)
			System.out.print(stack[i] + " ");
		System.out.println("");
	}
}