package arraysample;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {-4,-1,3,7,10,11};
        int b[]= {20,30,40,50,60,5,10};
        System.out.println(binarySearch(a,7));
        System.out.println(recursiveBinarySearch(a,0,a.length-1,7));
        System.out.println(recursiveBinarySearch(a,0,a.length-1,11));
        System.out.println("RoatedArray: " + searchInRotatedSortedArray(b,5));
        System.out.println("RoatedArray: " + searchInRotatedSortedArray(b,30));
        System.out.println("RoatedArray: " + searchInRotatedSortedArray(b,20));
        System.out.println("RoatedArray: " + searchInRotatedSortedArray(b,10));
    }
    /**Iterative
     * Binary search's mandatory condition: array must be sorted in ASC
     * @param a
     * @param key
     * @return
     */
    public static int binarySearch(int a[], int key){
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(key  == a[mid]){
                return mid;
            }else if(key > a[mid]){
               low = mid+1;
            }else{
             high = mid-1;
            }
        }
        return -1;
    }
    //Binary Search Recursive
    public static int recursiveBinarySearch(int a[],int low, int high, int key){
        if(low > high) return -1;
        int mid = (low + high)/2;
        if(key == a[mid]){
            return mid;
        }else if(key > a[mid]){
          return   recursiveBinarySearch(a,mid+1,high,key);
        }else{
           return recursiveBinarySearch(a,low,mid-1,key);
        }
    }

    //Search in infinite sorted Array
    public static  int searchInfinite(int a[], int key){
        int low = 0;
        int high = 1;
        while(a[high]< key){
            low = high;
            high = 2*high;
        }
        return recursiveBinarySearch(a,low,high,key);
    }

    //Method to search in sorted and rotated array
    public static int searchInRotatedSortedArray(int []a, int key){
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(key == a[mid]) return mid;
            /**
             * Check if first element of left part is less then mid element then left part is sorted
             * else right part is sorted
             */
            if(a[low] < a[mid]){
                if(key >= a[low] && key < a[mid]){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }else{
                if(key > a[mid] && key <= a[high]){
                   low = mid+1;
                }else{
                  high = mid -1;

                }
            }
        }
        return -1;
    }
}
