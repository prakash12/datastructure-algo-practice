package arraysample;

import java.util.HashMap;

public class SlidingWindowArray {

    public static void main(String[] args) {
        int a[] = {1,2,2,1,3,1,1,3};
        countDistinctElement(a,4);
       int A[] = {1,2,1,3,4,2,3};
        countDistinctElement(A,4);
    }
    /**
     * Count distinct element in every
     * window of size K
     */

    public static void  countDistinctElement(int a[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i <k;i++){
          map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map.size());

        for(int i = k; i<a.length;i++){
           if(map.get(a[i-k]) == 1){
               map.remove(a[i-k]);
           }else{
               map.put(a[i-k], map.getOrDefault(a[i-k],0)-1);
           }
           map.put(a[i],map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        }
    }
}
