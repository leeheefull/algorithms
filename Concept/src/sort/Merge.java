package sort;

public class Merge {

	public static void main(String[] args) {

		int arr[] = {30, 60, 40, 50, 20, 10};  

		// after
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		mergeSort(arr, 0, 5);

		// before
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void mergeSort(int[] arr, int low, int high){

		if(low<high) {
			int mid = (low+high)/2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high){

		int[] sorted = new int[arr.length];
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(k <= high) {
			if(mid < i)					sorted[k++] = arr[j++];
			else if(high < j)			sorted[k++] = arr[i++];
			else if(arr[j] < arr[i])	sorted[k++] = arr[j++];
			else						sorted[k++] = arr[i++];
		}
		for (k = low; k <= high; k++)
			arr[k] = sorted[k];
	}
}

//output
/*****************
30 60 40 50 20 10 
10 20 30 40 50 60 
******************/