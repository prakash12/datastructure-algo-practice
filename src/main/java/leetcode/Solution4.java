package leetcode;

import java.util.Arrays;

class Solution4 {
    public static void main(String[] args) {
        int []nums = {2,5,1,3,4,7}; int n = 3;
        int result[] = shuffle(nums,n);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+", ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int k =n;
        int r =n;
        for(int i=0;i<result.length;i++){
            result[i]=nums[n-r];
            result[i+1]= nums[k];
            i++;
            r--; k++;
        }
        return result;
    }
}