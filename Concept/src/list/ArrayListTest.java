package list;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		numbers.addLast(10);	// push 10
		numbers.addLast(20);	// push 20
		numbers.addLast(30);	// push 30
		numbers.addLast(40);	// push 40
		numbers.addLast(50);	// push 50
		System.out.println(numbers);	// [10, 20, 30, 40, 50]
		
		numbers.add(1, 15);		// add (index: 1 -> push: 15)
		System.out.println(numbers);	// [10, 15, 20, 30, 40, 50]
		
		numbers.addFirst(5);	// push first: 5
		numbers.addLast(60);	// push last: 60
		System.out.println(numbers);	// [5, 10, 15, 20, 30, 40, 50, 60]
		
		System.out.println(numbers.remove(1));	// remove (index: 1 -> remove: 10)
		System.out.println(numbers);	// [5, 15, 20, 30, 40, 50, 60]
		
		numbers.removeFirst();	// remove first: 5
		numbers.removeLast();	// remove first: 60
		System.out.println(numbers);	// [15, 20, 30, 40, 50]

		System.out.println(numbers.size());	// size: 5
		
		System.out.println(numbers.indexOf(40));	// value: 40 -> index: 3
		
		// very stupid iterator
		System.out.print("[" + numbers.get(0) + ", ");
		System.out.print(numbers.get(1) + ", ");
		System.out.print(numbers.get(2) + ", ");
		System.out.println(numbers.get(3) + "]");
		
		// stupid iterator
		System.out.print("[");
		for(int i=0; i<numbers.size(); i++) {
			System.out.print(numbers.get(i));
			if(i<numbers.size()-1)
				System.out.print(", ");
		}
		System.out.println("]");
		
		// cool iterator
		ArrayList.ListIterator li = numbers.listIterator();
		System.out.print("[ ");
		while(li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println("]");
		
		System.out.print("[ ");
		while(li.hasPrevious())
			System.out.print(li.previous() + " ");
		System.out.println("]");
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
//				li.remove();
			}
		}
		System.out.println(numbers);
	}
}