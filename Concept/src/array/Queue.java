package array;

public class Queue {

	private int front;
	private int back;
	private int size;
	private Object[] queue;
	
	public Queue(int size) {
		this.front = 0;
		this.back = -1;
		this.size = size;
		this.queue = new Object[size];
	}
	
	public boolean isEmpty() {
		return (front==back+1);
	}
	
	public boolean isFull() {
		return (back==size-1);
	}
	
	public void enqueue(Object item) {
		if(isFull())
			System.out.println("stack overflow");
		else 
			queue[++back] = item;
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		else
			return queue[front++];
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		else
			return queue[front];
	}
	
	public String toString() {
		String str = "[";
        for(int i=front; i<=back; i++) {
            str += queue[i];
        	if(i<back)
        		str += ", ";
        }
		return str + "]";
	}
}