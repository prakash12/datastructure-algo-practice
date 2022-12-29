package arraysample;

import java.util.HashMap;

public class FindSubArrayForGivenTragetSum {

    public static void getTargetSubArray(int a[], int targetSum){
        int currentSum =0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<a.length;i++){
           currentSum +=a[i];
            if(currentSum - targetSum == 0){
                start =0; end =i;
                break;
            }
            if(hashMap.containsKey(currentSum -targetSum)){
               start = hashMap.get(currentSum - targetSum)+1;
               end = i;
               break;
            }
            hashMap.put(currentSum,i);
        }
        if(end == -1){
            System.out.println("Sub array not found");
        }else{
            System.out.println(start + " "+ end);
        }

    }

    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        getTargetSubArray(a,5);
    }
}
