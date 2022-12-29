package leetcode;

import java.util.*;

public class LeastNumerProblem {
    public static void main(String[] args) {
        int arr[]={5,5,4};
        int k = 1;
        int arr1[] = {4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr,k));
        System.out.println(findLeastNumOfUniqueInts(arr1,3));
    }
    /**
     * 1481. Least Number of Unique Integers after K Removals
     * Given an array of integers arr and an integer k.
     * Find the least number of unique integers after removing exactly k elements.
     * @param arr
     * @param k
     * @return
     */
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int a : arr) {
            map.put(a, map.getOrDefault(a,0) +1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int count =0;
        for(int i =0 ; i< list.size() ;) {
            if(k - list.get(i) >=0) {
                k = k- list.get(i);
                i++;
                count ++;
            }
            else break;
        }
        return list.size() - count;
    }
}
