package sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]= {5,8,2,4,2,1,9,5,10};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j+1]< a[j]){
                    swap(a,j+1,j);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
