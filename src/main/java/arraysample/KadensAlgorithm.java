package arraysample;

public class KadensAlgorithm {
    public static void main(String[] args) {
        int a[] = {-5,4,6,-3,4,-1};
        System.out.println(maxSumSubArray(a));

        int b[] = {5,-4,-2,6,-1};
        System.out.println(maxSumSubArray(b));
    }
    /**
     *  Largest Sum Contiguous Subarray
     */
    public static int maxSumSubArray(int a[]){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0;i <a.length;i++){
            currentSum = currentSum +a[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum <0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
