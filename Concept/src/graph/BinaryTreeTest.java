package graph;

import java.util.Scanner;

public class BinaryTreeTest {

	public static void main(String[] args) {

		BinaryTree<String, Integer> bst = new BinaryTree<String, Integer>();
		Scanner scan = new Scanner(System.in);
		String[] keys = { "S", "E", "A", "R", "C", "H", "X", "M", "P", "L" };
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String search_key;

		// insert
		for (int i = 0; i < keys.length; i++) {
			bst.insert(keys[i], values[i]);
		}

		// inOrder
		bst.inOrder();
		System.out.println("Height of the BST : " + bst.height());
		System.out.println("Key of the root node : " + bst.getRootKey());

		// search
		System.out.print("Enter your search key : ");
		search_key = scan.nextLine();
		if (bst.search(search_key) == null) {
			System.out.println("=> No such key!");
		} else {
			System.out.println("=> " + bst.getValue(bst.search(search_key)));
		}
		scan.close();
	}
}