package com.cp.custom.array;

public class ArrayDelete {
    public static void deleteValue(int [] arr, int valueToBeDeleted){
        int lenOfArray = arr.length;
        int i;
        for(i =0;i< lenOfArray;i++ ){
            if(arr[i] == valueToBeDeleted) break;
        }
        for(int k =i; k<=lenOfArray;k++){
            arr[k] = arr[k+1];
            lenOfArray--;
        }
        System.out.println("Print array after delete");
       for(int j =0; j<arr.length-1;j++) System.out.print(arr[j]+ " ");
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        deleteValue(arr,7);

    }
}
