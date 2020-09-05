package array;

public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.peek();	// stack underflow

		stack.push(1);	// input 1
		System.out.println(stack);	// 1

		stack.push(2);	// input 2
		System.out.println(stack);	// 2 1

		stack.push(3);	// input 3
		System.out.println(stack);	// 3 2 1

		stack.push(4);	// input 4
		System.out.println(stack);	// 4 3 2 1

		stack.push(5);	// input 5
		System.out.println(stack);	// 5 4 3 2 1

		stack.push(6);	// stack overflow

		stack.pop();	// take out 5
		System.out.println(stack);	// 4 3 2 1

		stack.pop();	// take out 4
		System.out.println(stack);	// 3 2 1

		stack.pop();	// take out 3
		System.out.println(stack);	// 2 1

		stack.pop();	// take out 2
		System.out.println(stack);	// 1

		stack.pop();	// take out 1
		System.out.println(stack);

		stack.pop();	// stack underflow
	}		
}
