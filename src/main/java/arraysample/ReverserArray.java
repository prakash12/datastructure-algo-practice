package arraysample;

import java.util.ArrayList;

public class ReverserArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);arr.add(4);
        arr.add(5);
        arr.add(6);
        for (int a=0; a<arr.size();a++) {
            System.out.print(arr.get(a)+" ");
        }
        System.out.println();
        reverseArray(arr,3);
        for (int a: arr) {
            System.out.print(arr.get(a)+" ");
        }
    }
     static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int length = arr.size();
        for(int i=m+1;i<length;i++){
            if(i == length-1){
                break;
            }
            int e1 = arr.get(i);
            arr.add(i,arr.get(length-1));
            arr.add(length-1,e1);
        }
    }
}