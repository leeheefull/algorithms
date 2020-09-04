package array;

public class QueueTest {

	public static void main(String[] args) {

		Queue queue = new Queue(5);

		queue.dequeue();	// stack underflow

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

		queue.enqueue(6);	// stack overflow

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

		queue.dequeue();	// stack underflow
	}
}