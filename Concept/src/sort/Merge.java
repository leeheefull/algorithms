package sort;

public class Merge {

	public static void main(String[] args) {

		int arr[] = {30, 60, 40, 50, 20, 10};  

		// after
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		mergeSort(arr, 0, arr.length-1);

		// before
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void mergeSort(int[] arr, int left, int right){

		if(left<right) {
			int mid = (left+right)/2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right){

		int[] sorted = new int[arr.length];
		int i = left;
		int j = mid+1;
		int k = left;
		
		while(k <= right) {
			if(mid < i)					sorted[k++] = arr[j++];
			else if(right < j)			sorted[k++] = arr[i++];
			else if(arr[j] < arr[i])	sorted[k++] = arr[j++];
			else						sorted[k++] = arr[i++];
		}
		for (k = left; k <= right; k++)
			arr[k] = sorted[k];
	}
}

//output
/*****************
30 60 40 50 20 10 
10 20 30 40 50 60 
******************/