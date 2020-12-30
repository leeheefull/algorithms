package sort;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 30, 60, 40, 50, 20, 10 };

//		Bubble bubble = new Bubble(arr);
//		Selection selection = new Selection(arr);
//		Insertion insertion = new Insertion(arr);
//		Merge merge = new Merge(arr);
		Quick quick = new Quick(arr);

		// after
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

//		bubble.sort();
//		selection.sort();
//		insertion.sort();
//		merge.sort();
		quick.sort();

		// before
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//output
/*****************
 * 30 60 40 50 20 10 10 20 30 40 50 60
 ******************/