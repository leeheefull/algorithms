# Algorithm Concept
> Algorithm concept study using 'Java'

## Sort


<details>
  <summary>Bubble</summary>
  
  ---
  ## [Bubble](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Bubble.java)
  ```java
  public class Bubble {

    public static void main(String[] args) {

      int arr[] = {30, 60, 40, 50, 20, 10};  

      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");

      System.out.println();
      bubbleSort(arr);

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }

    public static void bubbleSort(int[] arr) {

      int n = arr.length;
      for(int i=n-1; 0<i; i--)
        for(int j=0; j<i; j++)
          if(arr[j] > arr[j+1])    
            swap(j, j+1, arr);
    }

    public static void swap(int x, int y, int[] arr) {
      int tmp = arr[x];
      arr[x] = arr[y];
      arr[y] = tmp;
    }
  }
  ```
  ```
  30 60 40 50 20 10 
  10 20 30 40 50 60 
  ```
  ---
</details>


<details>
  <summary>Selection</summary>
  
  ---
  ## [Selection](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Selection.java)
  ```java
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
  ```
  ```
  30 60 40 50 20 10 
  10 20 30 40 50 60 
  ```
  ---
</details>


<details>
  <summary>Insertion</summary>
  
  ---
  ## [Insertion](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Insertion.java)
  ```java
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
  ```
  ```
  30 60 40 50 20 10 
  10 20 30 40 50 60 
  ```
  ---
</details>


<details>
  <summary>Merge</summary>
  
  ---
  ## [Merge](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Merge.java)
  ```java
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
        if(mid < i)               sorted[k++] = arr[j++];
        else if(high < j)         sorted[k++] = arr[i++];
        else if(arr[j] < arr[i])  sorted[k++] = arr[j++];
        else                      sorted[k++] = arr[i++];
      }
      for (k = low; k <= high; k++)
        arr[k] = sorted[k];
    }
  }
  ```
  ```
  30 60 40 50 20 10 
  10 20 30 40 50 60 
  ```
  ---
</details>