package sort;

public class Merge {

	private int[] arr;
	private int left;
	private int right;
	
	public Merge(int[] arr) {
		
		this.arr = arr;
		this.left = 0;
		this.right = arr.length-1;
	}
	
	public void sort() {
		
		sort(left, right);
	}
	
	private void sort(int left, int right){

		int mid = (left+right)/2;
		
		if(left<right) {
			sort(left, mid);
			sort(mid+1, right);
			
			merge(left, mid, right);
		}
	}

	private void merge(int left, int mid, int right){

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