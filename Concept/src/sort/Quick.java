package sort;

public class Quick {

	public static void main(String[] args) {
	
		int arr[] = {30, 60, 40, 50, 20, 10};  

		// after
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		quickSort(arr, 0, arr.length-1);

		// before
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void quickSort(int[] arr, int left, int right) {

		if(left<right) {
			int pivot = partition(arr, left, right);
			
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {

		int pivot = arr[right];
		int i = left-1;
		
		for(int j=left; j<=right-1; j++)
			if(arr[j]<=pivot)
				swap(++i, j, arr);
		
		swap(i+1, right, arr);
		return i+1;
	}
	
	public static void swap(int x, int y, int[] arr) {
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}

//output
/*****************
30 60 40 50 20 10 
10 20 30 40 50 60 
******************/