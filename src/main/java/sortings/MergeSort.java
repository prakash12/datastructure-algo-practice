package sortings;

public class MergeSort {
    public static void main(String[] args) {
     int a[] = {9,6,7,5,4,3,2,1};
     mergeSort(a,0,a.length-1);
     for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
     }
    }
    public static void mergeSort(int a[], int left, int right){
        int mid = (left+right)/2;
        if(left < right){
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }

    }

    private static void merge(int[] a, int left, int mid, int right) {
        int b[] = new int[a.length];
        int i =left;
        int j = mid +1;
        int k = left;
        while (i<= mid && j <= right){
            if(a[i]< a[j]){
                b[k]  = a[i];
                i++;
            }else{
                b[k]= a[j];
                j++;
            }
            k++;
        }
        if(i > mid){
           while (j <= right){
               b[k++] = a[j++];
            }
        }else{
            while (i<=mid){
                b[k++] = a[i++];
            }
        }
        for(k =left;k<=right;k++){
           a[k] = b[k];
        }
    }
}
