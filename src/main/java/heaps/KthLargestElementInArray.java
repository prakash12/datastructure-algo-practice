package heaps;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public static int kthLargestElement(int []a, int k){
        //Java priority queue build min heap by default
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //Create a priority queue of size k-1
        for(int i=0;i<k;i++){
            priorityQueue.add(a[i]);
        }
        //Find kth largest element from  array
        for(int i=k;i<a.length;i++){
            if(priorityQueue.peek() < a[i]){
               priorityQueue.poll();
               priorityQueue.add(a[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int a[] ={20,10,30,40,50,60};
        System.out.println(kthLargestElement(a,5));
    }
}
