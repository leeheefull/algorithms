package sort;

public class Insertion {
	
	private int[] arr;
	private int size;
	
	public Insertion(int[] arr) {
		
		this.arr = arr;
		this.size = arr.length;
	}

	public void sort() {
		
		int n = size;
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