package dynamicprogramming;

import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) {
        System.out.println("fib of 1:"+fib(1));
        System.out.println("fib of 35:"+fib(35));
        // Inintialize memoize array
        System.out.println("fib of 1:"+fib_memo(1,new Integer[1]));
        System.out.println("fib of 3:"+fib_memo(3,new Integer[3]));
        System.out.println("fib of 35:"+fib_memo(35,new Integer[35]));
        System.out.println("fib of 100:"+ fib_bottom_up(100));

    }
    /**
     * Using recursion
     * @param n
     * @return
     */
    public static int fib(int n){
        int result;
        if (n==1 || n==2){
            result =1;
        }else{
            result = fib(n-1)+fib(n-2);
        }
        return result;
    }

    public static int fib_memo(int n,Integer[] memo){
        int result=0;
        Arrays.fill(memo,-1);
        if(memo[n-1] > -1){
            return memo[n-1];
        }
        if (n==1 || n==2){
            result = 1;
        }else{
            result = fib_memo(n-1,memo)+fib_memo(n-2,memo);
            memo[n-1] = result;
        }
        return result;
    }

    /**
     * Bottom up approach
     * @param n
     * @return
     */
    public static int fib_bottom_up(int n){
        if(n==1 || n==2) return 1;
        int bottom_up[] = new int[n+1];
        bottom_up[1] = 1;
        bottom_up[2] = 1;
        for(int i=3;i<=n;i++){
            bottom_up[i] = bottom_up[i-1]+bottom_up[i-2];
        }
        return bottom_up[n];
    }
}
