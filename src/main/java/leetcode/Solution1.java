package leetcode;
class Solution1 {
    public static void main(String[] args) {
        int a[]= {3,2,2,3};
        int val = 3;
        int nums[] = {0,0,1};//{0,1,0,3,12};
        int aa[]={0,1,0,3,12};
        //System.out.println(removeElement(a,val));
        //moveZeroes(aa);
        int arr[] = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
        int arr1[] = {1,1};
        System.out.println(findSpecialInteger(arr1));
    }
    public static  int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int count=0;

        for(int i=0; i<nums.length;i++){
            if(val != nums[i]){
             nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i =0;i< nums.length; i++){
            // 0,0,1
            if(nums[i] != 0){
                    int temp = nums[i] ;
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }

    }
    public static void moveZeroes1(int[] nums) {

        if(nums==null || nums.length==1 || nums.length==0)
            return;

        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

    public static int findSpecialInteger(int[] arr) {
        if(arr.length  == 0) return 0;
        int count = 0;
        int moreThen25 = (arr.length)/4;
        for(int i=0;i < arr.length;){
            int tempCount =0;
            int num = arr[i];
            for(int j =i;j<arr.length;j++){
                if(num == arr[j]){
                    tempCount++;
                }else{
                    break;
                }
            }
            if(tempCount > moreThen25){
                return num;
            }else{
               i += tempCount;
            }

        }
        return count;
    }
}