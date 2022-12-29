package leetcode;

class Solution2 {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7}; int k = 3;
		int b[] ={-1,-100,3,99};
		rotate2(nums,k);
		//rotate(b,2);
	}
    public static void rotate(int[] nums, int k) {
      while(k >=0){
      	int temp = nums[nums.length-1];
      	for(int i=nums.length-1;i>0;i--){
      		nums[i] = nums[i-1];
		}
      	nums[0]=temp;
      	k--;
	  }
    }
	private static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int tmp = nums[start];
			nums[start++] = nums[end];
			nums[end--] = tmp;
		}
	}
	public static void rotate2(int[] nums, int k) {
		int n = nums.length;
		k %= n;

		reverse(nums, 0, n - k - 1);
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n - 1);

	}
}