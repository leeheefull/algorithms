package sort;

public class Insertion {

	public static void main(String[] args) {
		
		int arr[] = {30, 60, 40, 50, 20, 10};  

		// after
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		insertionSort(arr);
		
		// before
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void insertionSort(int[] arr) {
		
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}

// output
/*****************
30 60 40 50 20 10 
10 20 30 40 50 60 
******************/