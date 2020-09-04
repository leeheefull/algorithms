package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAPI {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<> ();
		
		numbers.add(1);
		System.out.println(numbers);
		
		numbers.add(2);
		System.out.println(numbers);
		
		numbers.add(3);
		System.out.println(numbers);
		
		numbers.add(4);
		System.out.println(numbers);
		
		numbers.add(1, 5);
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		System.out.println("Index[2]: " + numbers.get(2));
		
		System.out.println("Size: " + numbers.size());

		// ---------------------------------------------------
		
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()){
			int value = (int) it.next();
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		for(int value: numbers)
			System.out.print(value + " ");
		
		System.out.println();
		
		for(int i=0; i<numbers.size(); i++)
			System.out.print(numbers.get(i) + " ");
	}
}