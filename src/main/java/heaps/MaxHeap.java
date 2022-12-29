package heaps;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;
    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize];
    }
    //Position of Parent Node
    public int parent(int position){
        return (position -1)/2;
    }

    // Left child
    public int leftChild(int position){
        return (2 * position);
    }
  // Right Child of Heap
    public int rightChild(int position){
        return (2*position) +1;
    }

    // Check if given node is leaf
    public boolean isLeaf(int position){
        if(position > (size/2) && position <= size){
            return true;
        }
        return false;
    }
    // Method 5
    // Swaping nodes
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    //Max heapify method

    private void maxHeapify(int position){
        if(isLeaf(position)){
            return;
        }
        if(heap[position] < heap[leftChild(position)] || heap[position] < heap[rightChild(position)] ){
          if(heap[leftChild(position)] > heap[rightChild(position)]){
             swap(position,leftChild(position));
             maxHeapify(leftChild(position));
          }else{
              swap(position,rightChild(position));
              maxHeapify(rightChild(position));
          }
        }
    }

    public void insert(int element)
    {
        heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
    // To display heap
    public void print()
    {
        for (int i = 0; i <= size / 2; i++) {
            System.out.print(
                    " PARENT : " + heap[i]
                            + " LEFT CHILD : " + heap[2 * i + 1]
                            + " RIGHT CHILD :" + heap[2 * i + 2]);
            System.out.println();
        }
    }

    // Method 9
    // Remove an element from max heap
    public int extractMax()
    {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    // Method 10
    // main dri er method
    public static void main(String[] arg)
    {
        // Display message for better readibilty
        System.out.println("The Max Heap is ");

        MaxHeap maxHeap = new MaxHeap(15);

        // Inserting nodes
        // Custom inputs
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        // Calling maxHeap() as defined above
        maxHeap.print();

        // Print and display the maximum value in heap
        System.out.println("The max val is "
                + maxHeap.extractMax());
    }
}

