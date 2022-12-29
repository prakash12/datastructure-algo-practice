package recursion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Print your name n times using recursion
 */
public class RecursionProblem1 {
    public static void main(String[] args) {

       int a[]= {1,2,3,4,5};
       reverseArray(0,a,a.length);
       for(int i=0;i <a.length;i++){
           System.out.print(a[i]+" ");
       }
    }

    static void reverseArray(int i, int[]arr, int n) {
      if(i>= n/2) {
          return;
      }
      swap(arr,i,n-i-1);
      reverseArray(i+1,arr,n);

    }

    private static void swap(int[] arr, int i,int n) {
       int item = arr[i];
        arr[i] = arr[n];
       arr[n] = item;
    }
}
