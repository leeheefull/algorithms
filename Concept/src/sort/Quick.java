package sort;

public class Quick {

	private int[] arr;
	private int left;
	private int right;

	public Quick(int[] arr) {

		this.arr = arr;
		this.left = 0;
		this.right = arr.length-1;
	}

	public void sort() {
		sort(left, right);
	}

	private void sort(int left, int right) {

		if(left<right) {
			int pivot = partition(left, right);

			sort(left, pivot-1);
			sort(pivot+1, right);
		}
	}

	private int partition(int left, int right) {

		int pivot = arr[right];
		int i = left-1;

		for(int j=left; j<=right-1; j++)
			if(arr[j]<=pivot)
				swap(++i, j);

		swap(i+1, right);
		return i+1;
	}

	private void swap(int x, int y) {

		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}