package linearStructure;

public class Queue {

	private int front;
	private int rear;
	private int size;
	private Object[] queue;
	
	public Queue(int size) {
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.queue = new Object[size];
	}
	
	public boolean isEmpty() {
		return (front==rear+1);
	}
	
	public boolean isFull() {
		return (rear==size-1);
	}
	
	public void enqueue(Object item) {
		if(isFull())
			System.out.println("queue is full");
		else {
			queue[++rear] = item;
			System.out.println("enqueue: " + item);
		}
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		}
		else {
			System.out.println("dequeue: " + queue[front]);
			return queue[front++];
		}
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		}
		else {
			System.out.println("peek: " + queue[front]);
			return queue[front];
		}
	}
	
	public void print() {
		System.out.print("queue: ");
        for(int i=front; i<=rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
	}
}