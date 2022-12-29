package arraysample;

public class CheckSortedArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int arr1[]={1,2,3,4,5,7,6,8,5};

        if(checkSortedArray(arr,1)){
            System.out.println("Sorted Array");
        }else{
            System.out.println("Unsorted Array");
        }
        if(checkSortedArray(arr1,1)){
            System.out.println("Sorted Array");
        }else{
            System.out.println("Unsorted Array");
        }
    }

    public static boolean checkSortedArray(int arr[], int index){
        if(index >=arr.length){
            return true;
        }
        if(arr[index] < arr[index-1]){
            return false;
        }

       return checkSortedArray(arr, index+1);
    }
}
