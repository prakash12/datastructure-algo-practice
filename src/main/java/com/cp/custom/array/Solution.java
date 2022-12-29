package com.cp.custom.array;

class Solution {
    public static void duplicateZeros(int[] arr) {
      int len = arr.length;
       for(int i=0;i<arr.length;i++) {
           if (arr[i] == 0) {
               break;
           }
               for (int k = i; k < len; k++) {
                      arr[k] = arr[k+1];
                      len--;
               }

       }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}