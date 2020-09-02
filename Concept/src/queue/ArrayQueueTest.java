package queue;

public class ArrayQueueTest {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(5);

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