package arraysample;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,3,4};
        System.out.println(removeDuplicates(a));
    }
    public static  int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[++k] = nums[i];
            }
        }

        return ++k;

    }
}
