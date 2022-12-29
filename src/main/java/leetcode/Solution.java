package leetcode;

import java.util.Arrays;

class Solution {
    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for(int k=0;k<nums.length;k+=2){
            length +=nums[k];
        }
         int arr[] = new int[length];
         int start = 0;
        for (int i = 0; i < nums.length; i += 2) {
             int freq = nums[i];
             int val = nums[i + 1];
            Arrays.fill(arr, start, start + freq, val);
            start += freq;
    }
    return arr;
  }
    
}