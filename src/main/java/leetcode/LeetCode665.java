package leetcode;

public class LeetCode665 {
    public static void main(String[] args) {
        int nums[]={3,4,2,3};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums) {
        int count =0;
        for(int i=1;i<=nums.length && count <2;i++){
            if((nums[i]< nums[i-1])){
                count++;
                if(i-2<0 || nums[i-2]<=nums[i])   nums[i-1]=nums[i];
                else nums[i]=nums[i-1];
            }
        }

        return count <2;
    }
}
