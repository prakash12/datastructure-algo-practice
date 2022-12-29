package arraysample;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    //Sieve of Eratosthenes
    public static int countPrimes(int n) {
       boolean a [] = new boolean[n+1];
       int count = 0;
        Arrays.fill(a,true);
        for(int i =2; i*i <=n;i++){
          if(a[i] == true){
              for (int j = i * i; j <= n; j += i)
                  a[j] = false;
          }
        }
        for (int i = 2; i <= n; i++)
        {
            if (a[i] == true) {
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

}