package array;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.peek();	// stack underflow

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

		stack.push(6);	// stack overflow

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

		stack.pop();	// stack underflow
	}		
}