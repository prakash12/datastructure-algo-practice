package leetcode;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int b[] ={1,2,1};
        getConcatenation(b);
    }
    public static int[] getConcatenation(int[] nums) {
        int j = nums.length;
        int k =0;
        int result[] = new int[2*j];
        for(int i=0;i<j;i++){
            result[k++] = nums[i];
        }
        for(int i=0;i<j;i++){
            result[k++] = nums[i];
        }
        return nums;
    }
}
