# Algorithm Concept
> Algorithm concept study using 'Java'


## Linear Structure

<details>
  <summary>Stack</summary>
  
  ---
  ## [Stack](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/linearStructure/Stack.java)
  > First In Last Out / Last In First Out
  ```java
  public class Test {
  
    public static void main(String[] args) {

      Stack stack = new Stack(5);

      stack.peek();	// stack is empty
      stack.print();

      stack.push(1);	// input 1
      stack.print();	// 1

      stack.push(2);	// input 2
      stack.print();	// 2 1

      stack.push(3);	// input 3
      stack.print();	// 3 2 1

      stack.push(4);	// input 4
      stack.print();	// 4 3 2 1

      stack.push(5);	// input 5
      stack.print();	// 5 4 3 2 1

      stack.push(6);	// stack is full
      stack.print();	// 5 4 3 2 1

      stack.pop();	// take out 5
      stack.print();	// 4 3 2 1

      stack.pop();	// take out 4
      stack.print();	// 3 2 1

      stack.pop();	// take out 3
      stack.print();	// 2 1

      stack.pop();	// take out 2
      stack.print();	// 1

      stack.pop();	// take out 1
      stack.print();	// 

      stack.pop();	// stack is empty
      stack.print();
    }
  }
  ```
  ```java
  public class Stack {

    private int top;
    private int size;
    private int[] stack;

    public Stack(int size) {
      this.top = -1;
      this.size = size;
      stack = new int[size];
    }

    public boolean isEmpty() {
      return (top==-1);
    }

    public boolean isFull() {
      return (size-1<=top);
    }

    public void push(int item) {
      if(isFull())
        System.out.println("stack is full");
      else
        stack[++top] = item;
    }

    public int pop() {
      if(isEmpty()) {
        System.out.println("stack is empty");
        return 0;
      }
      else{
        System.out.println("(pop) " + stack[top]);
        return stack[top--];
      }
    }

    public int peek() {
      if(isEmpty()) {
        System.out.println("stack is empty");
        return 0;
      }
      else {
        System.out.println("(peek) " + stack[top]);
        return stack[top];
      }
    }

    public void print() {
      System.out.print(" <- (stack)");
      for(int i=top; 0<=i; i--)
        System.out.print(" " + stack[i] + " ");
      System.out.println("(end)\n");
    }
  }
  ```
  ---
</details>


<details>
  <summary>Queue</summary>
  
  ---
  ## [Queue](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/linearStructure/Queue.java)
  > First In First Out / Last In Last Out
  ```java
  public class Test {
  
    public static void main(String[] args) {
    
      Queue queue = new Queue(5);
		
      queue.dequeue();	// queue is empty
      queue.print();

      queue.enqueue(1);	// push: 1
      queue.print();		// 1

      queue.enqueue(2);	// push: 2
      queue.print();		// 1 2

      queue.enqueue(3);	// push: 3
      queue.print();		// 1 2 3

      queue.enqueue(4);	// push: 4
      queue.print();		// 1 2 3 4

      queue.enqueue(5);	// push: 5
      queue.print();		// 1 2 3 4 5

      queue.enqueue(6);	// queue is full
      queue.print();		// 1 2 3 4 5

      queue.peek();		// show: 5
      queue.print();		// 1 2 3 4 5

      queue.dequeue();	// take out: 1
      queue.print();		// 2 3 4 5

      queue.dequeue();	// take out: 2
      queue.print();		// 3 4 5

      queue.dequeue();	// take out: 3
      queue.print();		// 4 5

      queue.dequeue();	// take out: 4
      queue.print();		// 5

      queue.dequeue();	// take out: 5
      queue.print();

      queue.dequeue();	// queue is empty 
      queue.print();
    }
  }
  ```
  ```java
  public class Queue {

    private int front;
    private int rear;
    private int size;
    private Object[] queue;

    public Queue(int size) {
      this.front = 0;
      this.rear = -1;
      this.size = size;
      this.queue = new Object[size];
    }

    public boolean isEmpty() {
      return (front==rear+1);
    }

    public boolean isFull() {
      return (rear==size-1);
    }

    public void enqueue(Object item) {
      if(isFull())
        System.out.println("queue is full");
      else {
        queue[++rear] = item;
        System.out.println("enqueue: " + item);
      }
    }

    public Object dequeue() {
      if(isEmpty()) {
        System.out.println("queue is empty");
        return 0;
      }
      else {
        System.out.println("dequeue: " + queue[front]);
        return queue[front++];
      }
    }

    public Object peek() {
      if(isEmpty()) {
        System.out.println("queue is empty");
        return 0;
      }
      else {
        System.out.println("peek: " + queue[front]);
        return queue[front];
      }
    }

    public void print() {
      System.out.print("queue: ");
          for(int i=front; i<=rear; i++)
              System.out.print(queue[i] + " ");
          System.out.println();
    }
  }
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