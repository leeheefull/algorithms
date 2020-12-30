package graph;

import java.util.Scanner;

public class RedBlackTreeTest {

	public static void main(String[] args) {

		RedBlackTree<String, Integer> rbt = new RedBlackTree<String, Integer>();
		Scanner scan = new Scanner(System.in);
		String[] keys = { "S", "E", "A", "R", "C", "H", "X", "M", "P", "L" };
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String search_key;

		// insert
		for (int i = 0; i < keys.length; i++) {
			rbt.insert(keys[i], values[i]);
		}

		// inOrder
		rbt.inOrder();
		System.out.println("Height of the RBT : " + rbt.height());
		System.out.println("Key of the root node : " + rbt.getRootKey());

		// search
		System.out.print("Enter your search key : ");
		search_key = scan.nextLine();
		if (rbt.search(search_key) == null) {
			System.out.println("=> No such key!");
		} else {
			System.out.println("=> " + rbt.getValue(rbt.search(search_key)));
		}
		scan.close();
	}
}