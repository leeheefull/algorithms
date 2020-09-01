package sort;

public class Selection {
	
	private int[] arr;
	private int size;
	
	public Selection(int[] arr) {
		this.arr = arr;
		this.size = arr.length;
	}
	
	public void sort() {
		
		int n = size;
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++)
				if(arr[j] < arr[min])
					min = j;
			swap(min, i);
		}
	}
	
	private void swap(int x, int y) {
		
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}