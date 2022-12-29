package bitmanipulation;

public class FindElementAppearsOnceInArray {
    public static void main(String[] args) {
        int ar[] = {7, 3, 5, 4, 5, 3, 4};
        System.out.println(findElementWhichAppearsOnceInArray(ar));

    }
    public static int findElementWhichAppearsOnceInArray(int []nums){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
