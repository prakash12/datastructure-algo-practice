package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class GreatestNumberofCandies {
    public static void main(String[] args) {
        int candies[] ={4,2,1,1,2};
        System.out.println(kidsWithCandies(candies,1));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>(candies.length);
        int maxInCandies =0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>= maxInCandies){
                maxInCandies = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
          if((candies[i]+extraCandies) >= maxInCandies){
              booleanList.add(true);
          }else{
              booleanList.add(false);
          }
        }

        return booleanList;
    }
}