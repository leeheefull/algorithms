package array;

public class Stack {

	private int top;
	private int size;
	private Object[] stack;

	public Stack(int size) {
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
			System.out.println("stack overflow");
		else
			stack[++top] = item;
	}

	public Object pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		else
			return stack[top--];
	}

	public Object peek() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		else
			return stack[top];
	}

	public void print() {
		System.out.print("[ ");
		for(int i=top; 0<=i; i--)
			System.out.print(stack[i] + " ");
		System.out.println("]");
	}
}