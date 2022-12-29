package arraysample;

import java.security.spec.RSAOtherPrimeInfo;

public class Queue {
    int capacity;
    int arr[];
    int rear;
    public Queue(int n){
        this.capacity =n;
        arr = new int[n];
        rear = -1;
    }
    //Insert data into Queue
    public void  enQueue(int value){
        if(rear == capacity -1){
            return ;
        }
        rear++;
        arr[rear] = value;
    }

    //Method to remove element from array
    public int dQueue(){
        if(rear == -1){
            return -1;
        }
        int result = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return result;
    }
    //Print element of Queue
    public void getQueueElements(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.getQueueElements();
        queue.dQueue();
        queue.enQueue(4);
        System.out.println("After remove");
        queue.getQueueElements();
    }

}
