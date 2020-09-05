package array;

public class QueueTest {

	public static void main(String[] args) {

		Queue queue = new Queue(5);

		queue.dequeue();	// stack underflow

		queue.enqueue(1);	// push: 1
		System.out.println(queue);		// 1

		queue.enqueue(2);	// push: 2
		System.out.println(queue);		// 1 2

		queue.enqueue(3);	// push: 3
		System.out.println(queue);		// 1 2 3

		queue.enqueue(4);	// push: 4
		System.out.println(queue);		// 1 2 3 4

		queue.enqueue(5);	// push: 5
		System.out.println(queue);		// 1 2 3 4 5

		queue.enqueue(6);	// stack overflow

		queue.peek();		// show: 5
		System.out.println(queue);		// 1 2 3 4 5

		queue.dequeue();	// take out: 1
		System.out.println(queue);		// 2 3 4 5

		queue.dequeue();	// take out: 2
		System.out.println(queue);		// 3 4 5

		queue.dequeue();	// take out: 3
		System.out.println(queue);		// 4 5

		queue.dequeue();	// take out: 4
		System.out.println(queue);		// 5

		queue.dequeue();	// take out: 5
		System.out.println(queue);

		queue.dequeue();	// stack underflow
	}
}