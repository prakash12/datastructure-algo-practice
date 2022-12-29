package arraysample;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
     int a[]={5,6,2,7,4};
        System.out.println(maxProductDifference(a));
    }
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <4) return 0;
        return nums[nums.length-1] *nums[nums.length-2] - nums[0] * nums[1];
    }
}
