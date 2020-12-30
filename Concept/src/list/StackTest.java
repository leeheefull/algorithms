package list;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.peek(); // stack underflow

		for (int i = 1; i < 6; i++) {
			stack.push(i); // input: 1, 2, 3, 4, 5
			System.out.println(stack); // 5 4 3 2 1
		}
		stack.push(6); // stack overflow

		while (!stack.isEmpty()) {
			stack.pop(); // take out: 5, 4, 3, 2, 1
			System.out.println(stack);
		}
		stack.pop(); // stack underflow
	}
}
