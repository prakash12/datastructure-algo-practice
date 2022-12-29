package leetcode;

class Solution8 {
    public static void main(String[] args) {
       // System.out.println(smallestRepunitDivByK(1));
        System.out.println(smallestRepunitDivByK1(13));
       // System.out.println(smallestRepunitDivByK1(2));
    }
    public static int smallestRepunitDivByK(int k) {
        StringBuilder sb = new StringBuilder();
        int result = -1;
        while(true){
            sb = sb.append("1");
            int value = Integer.parseInt(sb.toString());
            if(value%k == 0){
                result = value;
                break;
            }
        }
        return result;
    }
    public static int smallestRepunitDivByK1(int k) {
        /**
         * Number ended with 1 always divisible by 1,3,7,9
         */
        int m = k%10;
        int n = 1;
        n = n%k;
        int result = 1;

        if (m==3 || m==7 || m==9 || m==1 ) {
            while (n != 0) {
                n= (n*10)+1;
                result++;
                n = n % k;
            }
        }
        else  {
            return -1;
        }

        return result;
    }
}