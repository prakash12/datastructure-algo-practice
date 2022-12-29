package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap();
        for(int i=0;i<arr.length;i++) {
            occur.put(arr[i], occur.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> setOfValues = new HashSet<>(occur.values());
        return occur.size() == setOfValues.size();
    }
}
