package leetcode;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int b[] = {1,2,3,4};
        runningSumFast(b);
    }
    public static  int[] runningSum(int[] nums) {
     int resultingSum[] = new int[nums.length];
     resultingSum[0] = nums[0];

     for(int i=1;i<nums.length;i++){
         int sum = 0;
         for(int j=i; j>=0;j--){
             sum += nums[j];
         }
         resultingSum[i] = sum;
     }
     return resultingSum;
    }

    public static  int[] runningSumFast(int[] nums) {
        int resultingSum[] = new int[nums.length];
        resultingSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int sum = resultingSum[i-1];
            resultingSum[i] = sum+nums[i];
        }
        return resultingSum;
    }
}
