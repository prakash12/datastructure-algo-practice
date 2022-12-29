package sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {4,1,9,3,6};
        selectionSort(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
   public static void selectionSort(int a[]){
       for(int i=0;i<a.length;i++ ){
           int min = i;
           for(int j=i+1; j<a.length;j++){
               if(a[j] < a[min]){
                 min = j;
               }
           }
           if(min !=i){
               swap(a,min,i);
           }
       }
   }

    private static void swap(int[] a, int min, int i) {
       int temp = a[min];
       a[min] = a[i];
       a[i]=temp;
    }
}
