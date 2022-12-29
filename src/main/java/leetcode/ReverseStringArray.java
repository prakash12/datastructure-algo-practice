package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ReverseStringArray {
    public static void main(String[] args) {
        int s[] = {1,2,3,1,2,3};
        int n[] = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(s,2));
        System.out.println(containsNearbyDuplicate(n,1));
        HashSet<String> ss = new HashSet<>();
        ss.add("--...-.");
        ss.add("--...-.");
        ss.add("--...--.");
        ss.add("--...--.");
        System.out.println(ss.size());

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i) <= k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }

            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
