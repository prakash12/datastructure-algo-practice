package heaps;

public class MaxHeapify {
    /**
     * MAX-HEAPIFY(A, i) /
     *         1 l == LEFT(i)
     *         2 r == RIGHT(i)
     *         3 if l <= A:heap-size and A[l]> A[i]
     *         4 largest == l
     *         5 else largest == i
     *         6 if r <= A:heap-size and A[r] > A[largest]
     *         7 largest == r
     *         8 if largest !== i
     *         9 exchange A[i] with A[largest]
     *         10 MAX-HEAPIFY(A, largest)
     */

    public static void maxHeapify(int []a, int n,int i) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && a[l] > a[largest]){
            largest = l;
        }
        if(r<n && a[r] > a[largest]){
            largest = r;
        }
        if(largest !=i){
            swap(a,i,largest);
            maxHeapify(a,n,largest);
        }
    }
    private static void swap(int arr[],int i, int largest){
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
    }

    public static void buildHeap(int arr[],int n){
        int startIndex = (n/2)-1;
        for(int i = startIndex;i>=0;i--){
           maxHeapify(arr,n,i);
        }
    }

    public static void heapSort(int arr[], int n){
        buildHeap(arr,n);
        System.out.println("Max Heap");
        for (int x:arr ) {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i =(n-1); i>=0;i--){
           swap(arr,0,i);
           maxHeapify(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int a[] = {16,4,10,14,7,9,3,2,8,1};
        int b[]={10,30,50,20,35,15};
        for (int x:a ) {
            System.out.print(x+" ");
        }
        //maxHeapify(b,b.length,1);
        //buildHeap(a,a.length);
        System.out.println();
        heapSort(a,a.length);
        for (int x:a ) {
            System.out.print(x+" ");
        }
    }
}
