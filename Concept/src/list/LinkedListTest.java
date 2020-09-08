package list;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList numbers = new LinkedList();
		
		numbers.addFirst(20);			// data: 20, next: head
		numbers.addFirst(10);			// data: 10, next: 20
		System.out.println(numbers);	// [10 -> 20]
		
		numbers.addLast(30);			// data: 30, next: tail
		numbers.addLast(40);			// data: 40, next: tail
		System.out.println(numbers);	// [10 -> 20 -> 30 -> 40]
		
		numbers.add(1, 15);				// data: 15, next: 20
		numbers.add(3, 25);				// data: 25, next: 30
		System.out.println(numbers);	// [10 -> 15 -> 20 -> 25 -> 30 -> 40]
		
		numbers.removeFirst();
		System.out.println(numbers);	// [15 -> 20 -> 25 -> 30 -> 40]
		
		numbers.remove(1);
		System.out.println(numbers);	// [15 -> 25 -> 30 -> 40]
		
		numbers.removeLast();
		System.out.println(numbers);	// [15 -> 25 -> 30]
		
		System.out.println(numbers.size());	// 3
		System.out.println(numbers.get(1));	// 25
		System.out.println(numbers.indexOf(30));	// 2
		
		LinkedList.ListIterator i = numbers.listIterator();

//		while(i.hasNext()) {
//			System.out.print(i.next() + " ");	// 15 25 30
//		}
//		System.out.println();
		
		i.add(10);	// data:10, next: 15
		i.next();
		i.add(20);	// data: 20, next: 25
		System.out.println(numbers);	// [10 -> 15 -> 20 -> 25 -> 30]
		i.remove();		// remove 20
		System.out.println(numbers);	// [10 -> 15 -> 25 -> 30]
	}
}