package sort;

public class Selection {

	public static void main(String[] args) {
		
		int arr[] = {30, 60, 40, 50, 20, 10};  

		// after
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
		selectionSort(arr);
		
		// before
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void selectionSort(int[] arr) {
		
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++)
				if(arr[j] < arr[min])
					min = j;
			
			swap(min, i, arr);
		}
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