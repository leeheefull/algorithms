# Algorithm Concept
> Algorithm concept study using 'Java'

## Sort

<details>
  <summary>Bubble</summary>
  
  ---
  #### [Bubble](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Bubble.java)
  ```java
  public Bubble(int[] arr) {
    this.arr = arr;
    this.size = arr.length;
  }
  ```
  ```java
  public void sort() {
    int n = size;
    for(int i=n-1; 0<i; i--)
      for(int j=0; j<i; j++)
        if(arr[j] > arr[j+1])    
          swap(j, j+1);
  }
  ```
  ```java
  private void swap(int x, int y) {
    int tmp = arr[x];
    arr[x] = arr[y];
    arr[y] = tmp;
  }
  ```
  ---
</details>

<details>
  <summary>Selection</summary>
  
  ---
  #### [Selection](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Selection.java)
  ```java
  public Selection(int[] arr) {
    this.arr = arr;
    this.size = arr.length;
  }
  ```
  ```java
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
  ```
  ```java
  private void swap(int x, int y) {
    int tmp = arr[x];
    arr[x] = arr[y];
    arr[y] = tmp;
  }
  ```
  ---
</details>

<details>
  <summary>Insertion</summary>
  
  ---
  #### [Insertion](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Insertion.java)
  ```java
  public Insertion(int[] arr) {
    this.arr = arr;
    this.size = arr.length;
  }
  ```
  ```java
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
  ```
  ---
</details>

<details>
  <summary>Merge</summary>
  
  ---
  #### [Merge](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Merge.java)
  ```java
  public Merge(int[] arr) {
    this.arr = arr;
    this.left = 0;
    this.right = arr.length-1;
  }
  ```
  ```java
  public void sort() {
    sort(left, right);
  }
  ```
  ```java
  private void sort(int left, int right){
    int mid = (left+right)/2;

    if(left<right) {
      sort(left, mid);
      sort(mid+1, right);

      merge(left, mid, right);
    }
  }
  ```
  ```java
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
  ```
  ---
</details>

<details>
  <summary>Quick</summary>
  
  ---
  #### [Quick](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/sort/Quick.java)
  ```java
  public Quick(int[] arr) {
    this.arr = arr;
    this.left = 0;
    this.right = arr.length-1;
  }
  ```
  ```java
  public void sort() {
    sort(left, right);
  }
  ```
  ```java
  private void sort(int left, int right) {

    if(left<right) {
      int pivot = partition(left, right);

      sort(left, pivot-1);
      sort(pivot+1, right);
    }
  }
  ```
  ```java
  private int partition(int left, int right) {
    int pivot = arr[right];
    int i = left-1;

    for(int j=left; j<=right-1; j++)
      if(arr[j]<=pivot)
        swap(++i, j);

    swap(i+1, right);
    return i+1;
  }
  ```
  ```java
  private void swap(int x, int y) {
    int tmp = arr[x];
    arr[x] = arr[y];
    arr[y] = tmp;
  }
  ```
  ---
</details>

<details>
  <summary>Heap</summary>
  
  ---
  #### Heap
  ```
  Not yet
  ```
  ---
</details>

<details>
  <summary>Shell</summary>
  
  ---
  #### Shell
  ```
  Not yet
  ```
  ---
</details>


## Queue

<details>
  <summary>ArrayQueue</summary>
  
  ---
  #### [ArrayQueue](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/queue/ArrayQueue.java)
  ```java
  public ArrayQueue(int size) {
    this.front = 0;
    this.back = -1;
    this.size = size;
    this.queue = new Object[size];
  }
  ```
  ```java
  public boolean isEmpty() {
    return (front==back+1);
  }
  ```
  ```java
  public boolean isFull() {
    return (back==size-1);
  }
  ```
  ```java
  public void enqueue(Object item) {
    if(isFull())
      System.out.println("stack overflow");
    else 
      queue[++back] = item;
  }
  ```
  ```java
  public Object dequeue() {
    if(isEmpty()) {
      System.out.println("stack underflow");
      return 0;
    }
    else
      return queue[front++];
  }
  ```
  ```java
  public Object peek() {
    if(isEmpty()) {
      System.out.println("stack underflow");
      return 0;
    }
    else
      return queue[front];
  }
  ```
  ```java
  public String toString() {
    String str = "[";
    for(int i=front; i<=back; i++) {
      str += queue[i];
      if(i<back)
        str += ", ";
    }
    return str + "]";
  }
  ```
  ---
</details>

<details>
  <summary>PriorityQueue</summary>
  
  --- 
  #### PriorityQueue
  ```
  Not yet
  ```
  ---
</details>


## List

<details>
  <summary>Stack</summary>
  
  ---
  #### [Stack](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/list/Stack.java)
  ```java
  public Stack(int size) {
    this.top = -1;
    this.size = size;
    stack = new Object[size];
  }
  ```
  ```java
  public boolean isEmpty() {
    return (top==-1);
  }
  ```
  ```java
  public boolean isFull() {
    return (size-1<=top);
  }
  ```
  ```java
  public void push(Object item) {
    if(isFull())
      System.out.println("stack overflow");
    else
      stack[++top] = item;
  }
  ```
  ```java
  public Object pop() {
    if(isEmpty()) {
      System.out.println("stack underflow");
      return 0;
    }
    else
      return stack[top--];
  }
  ```
  ```java
  public Object peek() {
    if(isEmpty()) {
      System.out.println("stack underflow");
      return 0;
    }
    else
      return stack[top];
  }
  ```
  ```java
  public String toString() {
    String str = "[";
    for(int i=top; 0<=i; i--) {
      str += stack[i];
      if(1<=i)
        str += ", ";
    }
    return str + "]";
  }
  ```
  ---
</details>

<details>
  <summary>ArrayList</summary>
  
  ---
  #### [ArrayList](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/list/ArrayList.java)
  > Init
  ```java
  public ArrayList() {
    this.size = 0;
    this.elementData = new Object[100];
  }
  ```
  > Add front of the list
  ```java
  public boolean addFirst(Object element) {
    add(0, element);
    return true;
  }
  ```
  > Add behind of the list
  ```java
  public boolean addLast(Object element) {
    elementData[size++] = element;
    return true;
  }
  ```
  > Add element to the index
  ```java
  public boolean add(int index, Object element) {
    for(int i=size-1; index<=i; i--)
      elementData[i+1] = elementData[i];
    elementData[index] = element;
    size++;
    return true;
  }
  ```
  > Print array list
  ```java
  public String toString() {
    String str = "[";
    for(int i=0; i<size; i++) {
      str += elementData[i];
      if(i<size-1)
        str += ", ";
    }
    return str + "]";
  }
  ```
  > Remove element located at index
  ```java
  public Object remove(int index) {
    Object removed = elementData[index];
    for(int i=index; i<=size-1; i++)
      elementData[i] = elementData[i+1];

    size--;
    elementData[size] = null;
    return removed;
  }
  ```
  > Remove front of the list
  ```java
  public Object removeFirst() {
    return remove(0);
  }
  ```
  > Remove behind of the list
  ```java
  public Object removeLast() {
    return remove(size-1);
  }
  ```
  > Get element to the index
  ```java
  public Object get(int index) {
    return elementData[index];
  }
  ```
  > Print array list size 
  ```java
  public int size() {
    return size;
  }
  ```
  > Find element and get the index
  ```java
  public int indexOf(Object o) {
    for(int i=0; i<size; i++)
      if(o.equals(elementData[i]))
        return i;

    return -1;
  }
  ```
  > Loop object
  ```java
  public ListIterator listIterator() {
    return new ListIterator();
  }
  ```
  #### Iterator
  > Init
  ```java
  public ListIterator() {
    this.nextIndex = 0;
  }
  ```
  > Return next index
  ```java
  public Object next() {
    return elementData[nextIndex++];
  }
  ```
  > Check if there is element at the next index
  ```java
  public boolean hasNext() {
    return nextIndex<size();
  }
  ```
  > Return previous index
  ```java
  public Object previous() {
    return elementData[--nextIndex];
  }
  ```
  > Check if there is element at the behind index
  ```java
  public boolean hasPrevious() {
    return 0<nextIndex;
  }
  ```
  > Add element at list 
  ```java
  public void add(Object element) {
    ArrayList.this.add(nextIndex++, element);
  }
  ```
  > Remove element at List
  ```java
  public void remove() {
    ArrayList.this.remove(nextIndex-1);
    nextIndex--;
  }
  ```
  ---
</details>

<details>
  <summary>LinkedList</summary>
  
  ---
  #### [LinkedList](https://github.com/leeheefull/Algorithms/tree/master/Concept/src/list/LinkedList.java)
  > Node
  ```java
  public class Node {
    private Object data;
    private Node next;

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Node(Object input) {
      this.data = input;
      this.next = null;
    }

    public String toString() {
      return String.valueOf(this.data);
    }
  }
  ```
  > Init
  ```java
  public LinkedList() {
    this.size = 0;
  }
  ```
  > Add front of the list
  ```java
  public void addFirst(Object input) {
    Node newNode = new Node(input);
    newNode.next = head;
    head = newNode;

    size++;
    if(head.next == null)
      tail = head;
  }
  ```
  > Add behind of the list
  ```java
  public void addLast(Object input) {
    Node newNode = new Node(input);
    if(size == 0)
      addFirst(input);
    else {
      tail.next = newNode;
      tail = newNode;
      size++;
    }
  }
  ```
  > Find node by index
  ```java
  Node node(int index) {
    Node x = head;
    for(int i=0; i<index; i++)
      x = x.next;
    return x;
  }
  ```
  > Add data
  ```java
  public void add(int index, Object input) {
    if(index == 0)
      addFirst(input);
    else {
      Node tmp1 = node(index-1);
      Node tmp2 = tmp1.next;

      Node newNode = new Node(input);
      tmp1.next = newNode;
      newNode.next = tmp2;
      size++;
      if(newNode.next == null)
        tail = newNode;
    }
  }
  ```
  > Print linked list
  ```java
  public String toString() {
    if(head == null)
      return "[]";
    Node tmp = head;
    String str = "[";

    while(tmp.next != null) {
      str += tmp.data + " -> ";
      tmp = tmp.next;
    }
    str += tmp.data;

    return str + "]";
  }
  ```
  > Remove front of the list
  ```java
  public Object removeFirst() {
    Node tmp = head;
    head = head.next;
    Object returnData = tmp.data;
    tmp = null;
    size--;
    return returnData;
  }
  ```
  > Remove data
  ```java
  public Object remove(int index) {
    if(index==0)
      return removeFirst();

    Node tmp = node(index-1);
    Node toDoDeleted = tmp.next;

    tmp.next = tmp.next.next;
    Object returnData = toDoDeleted.data;

    if(toDoDeleted == tail)
      tail = tmp;

    toDoDeleted = null;
    size--;
    return returnData;
  }
  ```
  > Remove behind of the list
  ```java
  public Object removeLast() {
    return remove(size-1);
  }
  ```
  > get list size
  ```java
  public int size() {
    return size;
  }
  ```
  > get data to the index
  ```java
  public Object get(int index) {
    Node tmp = node(index);
    return tmp.data;
  }
  ```
  > get index to the data
  ```java
  public int indexOf(Object data) {
    Node tmp = head;
    int index = 0;

    while(tmp.data != data) {
      tmp = tmp.next;
      index++;
      if(tmp == null)
        return -1;
    }
    return index;
  }
  ```
  > Iterator
  ```java
  public ListIterator listIterator() {
    return new ListIterator();
  }
  ```
  ---
  ```java
  public class ListIterator{
    private Node next;
    private Node lastReturned;
    private int nextIndex;

    public ListIterator() {
      this.next = head;
      this.nextIndex = 0;
    }

    public Object next() {
      lastReturned = next;
      next = next.next;
      nextIndex++;

      return lastReturned.data;
    }

    public boolean hasNext() {
      return nextIndex<size();
    }

    public void add(Object input) {
      Node newNode = new Node(input);

      if(lastReturned == null) {
        head = newNode;
        newNode.next = next;
      }
      else {
        lastReturned.next = newNode;
        newNode.next = next;
      }
      lastReturned = newNode;
      nextIndex++;
      size++;
    }

    public void remove() {
      if(nextIndex == 0)
        throw new IllegalStateException();
      LinkedList.this.remove(nextIndex-1);
      nextIndex--;
    }
  }
  ```
  ---
</details>

<details>
  <summary>Vector</summary>
  
  ---
  #### Vector
  ```
  Not yet
  ```
  ---
</details>

  
## Set

<details>
  <summary>HashSet</summary>
  
  ---
  #### HashSet
  ```
  Not yet
  ```
  ---
</details>

<details>
  <summary>TreeSet</summary>
  
  ---
  #### TreeSet
  ```
  Not yet
  ```
  ---
</details>


## Map

<details>
  <summary>HashTable</summary>
  
  ---
  #### HashTable
  ```
  Not yet
  ```
  ---
</details>

<details>
  <summary>HashMap</summary>
  
  ---
  #### HashMap
  ```
  Not yet
  ```
  ---
</details>

<details>
  <summary>TreeMap</summary>
  
  ---
  #### TreeMap
  ```
  Not yet
  ```
  ---
</details>


## Graph

<details>
  <summary>BinaryTree</summary>
  
  ---
  #### BinaryTree
  ```
  Not yet
  ```
  ---
</details>

<details>
  <summary>RedBlackTree</summary>
  
  ---
  #### RedBlackTree
  ```
  Not yet
  ```
  ---
</details>