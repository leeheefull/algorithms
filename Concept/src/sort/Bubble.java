package sort;

public class Bubble {
	
	private int[] arr;
	private int size;
	
	public Bubble(int[] arr) {
		
		this.arr = arr;
		this.size = arr.length;
	}
	
	public void sort() {
		
		int n = size;
		for(int i=n-1; 0<i; i--)
			for(int j=0; j<i; j++)
				if(arr[j] > arr[j+1])    
					swap(j, j+1);
	}
	
	private void swap(int x, int y) {
		
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}