package list;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		numbers.addLast(10);
		System.out.println(numbers);
		
		numbers.addLast(20);
		System.out.println(numbers);
		
		numbers.addLast(30);
		System.out.println(numbers);
		
		numbers.addLast(40);
		System.out.println(numbers);
		
		numbers.add(1, 15);
		System.out.println(numbers);
		
		numbers.addFirst(5);
		System.out.println(numbers);
	}
}