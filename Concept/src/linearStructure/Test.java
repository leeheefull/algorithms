package linearStructure;

public class Test {

	public static void main(String[] args) {
		
//		stack();
		queue();
	}

	private static void stack() {
	
		Stack stack = new Stack(5);
		
		stack.peek();	// stack is empty
		stack.print();
		
		stack.push(1);	// input 1
		stack.print();	// 1
		
		stack.push(2);	// input 2
		stack.print();	// 2 1
		
		stack.push(3);	// input 3
		stack.print();	// 3 2 1
		
		stack.push(4);	// input 4
		stack.print();	// 4 3 2 1
		
		stack.push(5);	// input 5
		stack.print();	// 5 4 3 2 1
		
		stack.push(6);	// stack is full
		stack.print();	// 5 4 3 2 1
		
		stack.pop();	// take out 5
		stack.print();	// 4 3 2 1
		
		stack.pop();	// take out 4
		stack.print();	// 3 2 1
		
		stack.pop();	// take out 3
		stack.print();	// 2 1
		
		stack.pop();	// take out 2
		stack.print();	// 1
		
		stack.pop();	// take out 1
		stack.print();
		
		stack.pop();	// stack is empty
		stack.print();
	}

	private static void queue() {
		
		Queue queue = new Queue(5);
		
		queue.dequeue();	// queue is empty
		queue.print();
		
		queue.enqueue(1);	// push: 1
		queue.print();		// 1
		
		queue.enqueue(2);	// push: 2
		queue.print();		// 1 2
		
		queue.enqueue(3);	// push: 3
		queue.print();		// 1 2 3
		
		queue.enqueue(4);	// push: 4
		queue.print();		// 1 2 3 4
		
		queue.enqueue(5);	// push: 5
		queue.print();		// 1 2 3 4 5
		
		queue.enqueue(6);	// queue is full
		queue.print();		// 1 2 3 4 5
		
		queue.peek();		// show: 5
		queue.print();		// 1 2 3 4 5
		
		queue.dequeue();	// take out: 1
		queue.print();		// 2 3 4 5

		queue.dequeue();	// take out: 2
		queue.print();		// 3 4 5
		
		queue.dequeue();	// take out: 3
		queue.print();		// 4 5
		
		queue.dequeue();	// take out: 4
		queue.print();		// 5
		
		queue.dequeue();	// take out: 5
		queue.print();
		
		queue.dequeue();	// queue is empty 
		queue.print();
	}
}