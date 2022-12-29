package leetcode;
import java.util.TreeSet;

class Solutiona {
    public static void main(String[] args) {
        int[] nums = {2, -1, 2, 4, -1};
        int k = 3;
        int[] nums1 = {2, -1, 2};
        int k1 = 3;
        int[] nums2 = {1};
        int k2 = 1;
        int[] nums3 = {1, 2};
        int k3 = 4;
        int[] n = {77, 19, 35, 10, -14};
        int n1 = 19;
        int s[] = {48,99,37,4,-31};
        int ss = 140;
        /*System.out.println(shortestSubarray(nums,k));
        System.out.println(shortestSubarray(nums1,k1));
        System.out.println(shortestSubarray(nums2,k2));
        System.out.println(shortestSubarray(nums3,k3));
        System.out.println(shortestSubarray(n, n1));*/
        System.out.println(shortestSubarray(s, ss));
    }

    public static int shortestSubarray(int[] nums, int k) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        if (nums.length <= 0) return -1;
        int sum = 0;
        int shortestPath = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k == nums[i]) {
                sortedSet.add(1);
                sum = 0;
            } else {
                sum += nums[i];
                shortestPath++;
                if (sum == k) {
                    sortedSet.add(shortestPath);
                    sum = 0;
                    shortestPath = 0;
                }
            }
        }
        if(!sortedSet.isEmpty()){
           if(sortedSet.size() == 1) {
              return sortedSet.stream().findFirst().get();
           }else {
               TreeSet<Integer> reverse = new TreeSet<>();
               reverse = (TreeSet) sortedSet.descendingSet();

               return reverse.last();

           }

        }

        return -1;
    }
}