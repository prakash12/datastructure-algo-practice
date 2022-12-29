package arraysample;

public class BoyerMooreAlgorithm {

    public static void main(String[] args) {
        int a [] = {2,1,2,2,2,1,1,3,2};
        int b [] = {1,2,3,4,5};
        System.out.println(majorityElement(a));
        System.out.println(majorityElement(b));
    }
    public static int majorityElement(int nums[]){
        int candidate = -1;
        int count =0;
        for (int index = 0; index < nums.length; index++) {
            if (count == 0) {
                candidate = nums[index];
                count = 1;
            }
            else {
                if (nums[index] == candidate)
                    count++;
                else
                    count--;
            }
        }
        // Checking if majority candidate occurs more than
        // n/2 times
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == candidate)
                count++;
        }
        if (count > (nums.length / 2))
            return candidate;
        return -1;
    }
}
