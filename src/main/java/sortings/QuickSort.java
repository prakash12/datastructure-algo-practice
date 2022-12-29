package sortings;


public class QuickSort {

    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3};
        quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.printf(a[i]+ " ");
        }
    }
    /**
     * Quick sort using recursion
     * @param a
     * @param low
     * @param high
     * @return
     *
     * Best case time complexity: O(nlogn)
     * Worst Case time complexity: O(n^2)
     * Space complexity: O(n)
     */

    public static void quickSort(int a[],int low, int high){
       if(low <high){
           int pivot = partition(a,low,high);
           quickSort(a,low,pivot-1);
           quickSort(a,pivot+1,high);
       }
    }
    public static int partition(int a[], int low,int high){
        int pivot = a[low];
        int i = low;
        int j = high;
        while(i< j){
            while(a[i]<= pivot) i++;
            while(a[j] >pivot) j--;
            if(i<j){
                swap(a, i,j);
            }
        }
        swap(a,j,low);
        return j;
    }

    private static  void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
