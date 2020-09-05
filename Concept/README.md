# Algorithm Concept
> Algorithm concept study using 'Java'


## Array

<details>
  <summary>Stack</summary>
  
  ---
  ## [Stack](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/array/Stack.java)
  > First In Last Out / Last In First Out
  ```java
  public class StackTest {

    public static void main(String[] args) {

      Stack stack = new Stack(5);

      stack.peek(); // stack underflow

      stack.push(1);  // input 1
      System.out.println(stack);  // 1

      stack.push(2);  // input 2
      System.out.println(stack);  // 2 1

      stack.push(3);  // input 3
      System.out.println(stack);  // 3 2 1

      stack.push(4);  // input 4
      System.out.println(stack);  // 4 3 2 1

      stack.push(5);  // input 5
      System.out.println(stack);  // 5 4 3 2 1

      stack.push(6);  // stack overflow

      stack.pop();  // take out 5
      System.out.println(stack);  // 4 3 2 1

      stack.pop();  // take out 4
      System.out.println(stack);  // 3 2 1

      stack.pop();  // take out 3
      System.out.println(stack);  // 2 1

      stack.pop();  // take out 2
      System.out.println(stack);  // 1

      stack.pop();  // take out 1
      System.out.println(stack);

      stack.pop();  // stack underflow
    }
  }
  ```
  ```java
  public class Stack {

    private int top;
    private int size;
    private Object[] stack;

    public Stack(int size) {
    
      this.top = -1;
      this.size = size;
      stack = new Object[size];
    }

    public boolean isEmpty() {
    
      return (top==-1);
    }

    public boolean isFull() {
    
      return (size-1<=top);
    }

    public void push(Object item) {
    
      if(isFull())
        System.out.println("stack overflow");
      else
        stack[++top] = item;
    }

    public Object pop() {
    
      if(isEmpty()) {
        System.out.println("stack underflow");
        return 0;
      }
      else
        return stack[top--];
    }

    public Object peek() {
    
      if(isEmpty()) {
        System.out.println("stack underflow");
        return 0;
      }
      else
        return stack[top];
    }

    public String toString() {
      String str = "[";
      for(int i=top; 0<=i; i--) {
        str += stack[i];
        if(1<=i)
          str += ", ";
      }
      return str + "]";
    }
  }
  ```
  ```
  stack underflow
  [1]
  [2, 1]
  [3, 2, 1]
  [4, 3, 2, 1]
  [5, 4, 3, 2, 1]
  stack overflow
  [4, 3, 2, 1]
  [3, 2, 1]
  [2, 1]
  [1]
  []
  stack underflow
  ```
  ---
</details>

<details>
  <summary>Queue</summary>
  
  ---
  ## [Queue](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/array/Queue.java)
  > First In First Out / Last In Last Out
  ```java
  public class QueueTest {

    public static void main(String[] args) {

      Queue queue = new Queue(5);

      queue.dequeue();  // stack underflow

      queue.enqueue(1); // push: 1
      System.out.println(queue);  // 1

      queue.enqueue(2); // push: 2
      System.out.println(queue);  // 1 2

      queue.enqueue(3); // push: 3
      System.out.println(queue);  // 1 2 3

      queue.enqueue(4); // push: 4
      System.out.println(queue);  // 1 2 3 4

      queue.enqueue(5); // push: 5
      System.out.println(queue);  // 1 2 3 4 5

      queue.enqueue(6); // stack overflow

      queue.peek(); // show: 5
      System.out.println(queue);  // 1 2 3 4 5

      queue.dequeue();  // take out: 1
      System.out.println(queue);  // 2 3 4 5

      queue.dequeue();  // take out: 2
      System.out.println(queue);  // 3 4 5

      queue.dequeue();  // take out: 3
      System.out.println(queue);  // 4 5

      queue.dequeue();	// take out: 4
      System.out.println(queue);		// 5

      queue.dequeue();  // take out: 5
      System.out.println(queue);

      queue.dequeue();  // stack underflow
    }
  }
  ```
  ```java
  public class Queue {

    private int front;
    private int back;
    private int size;
    private Object[] queue;

    public Queue(int size) {
      this.front = 0;
      this.back = -1;
      this.size = size;
      this.queue = new Object[size];
    }

    public boolean isEmpty() {
      return (front==back+1);
    }

    public boolean isFull() {
      return (back==size-1);
    }

    public void enqueue(Object item) {
      if(isFull())
        System.out.println("stack overflow");
      else 
        queue[++back] = item;
    }

    public Object dequeue() {
      if(isEmpty()) {
        System.out.println("stack underflow");
        return 0;
      }
      else
        return queue[front++];
    }

    public Object peek() {
      if(isEmpty()) {
        System.out.println("stack underflow");
        return 0;
      }
      else
        return queue[front];
    }

    public String toString() {
      String str = "[";
          for(int i=front; i<=back; i++) {
              str += queue[i];
            if(i<back)
              str += ", ";
          }
      return str + "]";
    }
  }
  ```
  ```
  stack underflow
  [1]
  [1, 2]
  [1, 2, 3]
  [1, 2, 3, 4]
  [1, 2, 3, 4, 5]
  stack overflow
  [1, 2, 3, 4, 5]
  [2, 3, 4, 5]
  [3, 4, 5]
  [4, 5]
  [5]
  []
  stack underflow
  ```
  ---
</details>


## List

<details>
  <summary>ArrayList API</summary>
  
  ---
  ## [ArrayList API](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/list/ArrayListAPI.java)
  ```java
  import java.util.ArrayList;
  import java.util.Iterator;

  public class ArrayListAPI {

    public static void main(String[] args) {

      ArrayList<Integer> numbers = new ArrayList<> ();

      numbers.add(1);
      System.out.println(numbers);

      numbers.add(2);
      System.out.println(numbers);

      numbers.add(3);
      System.out.println(numbers);

      numbers.add(4);
      System.out.println(numbers);

      numbers.add(1, 5);
      System.out.println(numbers);

      numbers.remove(2);
      System.out.println(numbers);

      System.out.println("Index[2]: " + numbers.get(2));

      System.out.println("Size: " + numbers.size());

      // ---------------------------------------------------

      Iterator<Integer> it = numbers.iterator();

      while(it.hasNext()){
        int value = (int) it.next();
        System.out.print(value + " ");
      }

      System.out.println();

      for(int value: numbers)
        System.out.print(value + " ");

      System.out.println();

      for(int i=0; i<numbers.size(); i++)
        System.out.print(numbers.get(i) + " ");
    }
  }
  ```
  ```
  [1]
  [1, 2]
  [1, 2, 3]
  [1, 2, 3, 4]
  [1, 5, 2, 3, 4]
  [1, 5, 3, 4]
  Index[2]: 3
  Size: 4
  1 5 3 4 
  1 5 3 4 
  1 5 3 4 
  ```
  ---
</details>


## Sort

<details>
  <summary>Bubble</summary>
  
  ---
  ## [Bubble](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Bubble.java)
  ```java
  public class Test {

    public static void main(String[] args) {

      int arr[] = {30, 60, 40, 50, 20, 10};
      Bubble bubble = new Bubble(arr);

      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
      System.out.println();

      bubble.sort();

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  }
  ```
  
  ```java
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
  public class Test {

    public static void main(String[] args) {

      int arr[] = {30, 60, 40, 50, 20, 10};
      Selection selection = new Selection(arr);

      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
      System.out.println();

      selection.sort();

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  }
  ```
  
  ```java
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
  public class Test {

    public static void main(String[] args) {
		
      int arr[] = {30, 60, 40, 50, 20, 10};
		  Insertion insertion = new Insertion(arr);
		
      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
      System.out.println();

      insertion.sort();

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  }
  ```
  ```java
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
  public class Test {

    public static void main(String[] args) {

      int arr[] = {30, 60, 40, 50, 20, 10};
      Merge merge = new Merge(arr);

      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
      System.out.println();

      merge.sort();

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  }
  ```
  ```java
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
        if(mid < i)               sorted[k++] = arr[j++];
        else if(right < j)        sorted[k++] = arr[i++];
        else if(arr[j] < arr[i])  sorted[k++] = arr[j++];
        else                      sorted[k++] = arr[i++];
      }
      for (k = left; k <= right; k++)
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

<details>
  <summary>Quick</summary>
  
  ---
  ## [Quick](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Quick.java)
  ```java
  public class Test {

    public static void main(String[] args) {

      int arr[] = {30, 60, 40, 50, 20, 10};
      Quick quick = new Quick(arr);

      // after
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
      System.out.println();

      quick.sort();

      // before
      for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
  }
  ```
  ```java
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
  ```
  ```
  30 60 40 50 20 10 
  10 20 30 40 50 60 
  ```
  ---
</details>