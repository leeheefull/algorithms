package queue;

public class ArrayQueueTest {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(5);

		queue.dequeue(); // stack underflow

		for (int i = 1; i < 6; i++) {
			queue.enqueue(i); // push: 1, 2, 3, 4, 5
			System.out.println(queue); // 1 2 3 4 5
		}
		queue.enqueue(6); // stack overflow

		System.out.println(queue.peek()); // show: 1

		for (int i = 0; i < 5; i++) {
			queue.dequeue(); // take out: 1, 2, 3, 4, 5
			System.out.println(queue);
		}
		queue.dequeue(); // stack underflow
	}
}