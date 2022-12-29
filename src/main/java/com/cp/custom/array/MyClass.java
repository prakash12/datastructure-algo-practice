package com.cp.custom.array;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
        
       List<List<Integer>> ll=   new ArrayList<List<Integer>>();
       List<Integer>l1 = new ArrayList<Integer>();
       l1.add(1);
       l1.add(2);
       ll.add(l1);
       
       List<Integer>l2 = new ArrayList<Integer>();
       l2.add(3);
       l2.add(4);
       ll.add(l2);
       
       List<Integer>l3 = new ArrayList<Integer>();
       l3.add(1);
       l3.add(6);
       ll.add(l3);
       List lll = getChildWithSingleParent(ll);

    }
// Find the elements whose having exactly one parent.
// Write the code which takes the input as 2D Array and writen the list whose having exactly one parent. 
// In array, the first element is child id while second element is parent_id.
// [child_id, parent_id]
// test case:1
// i/p:
// [[1,2],[5,1],[3,2],[5,1],[9,6],[10,1],[9,1],[3,6],[3,2]]
// o/p:
// 1,5,10

// test case:2
// [[1,2],[3,4],[5,6]]
// o/p:
// 1,3,5
    
    public static List<Integer> getChildWithSingleParent(List<List<Integer>> itemList){
        List<Integer> childWithOnlyParent = new ArrayList<Integer>();
        for(int i=0;i<itemList.size();i++){
            int count = 1;
          int childID = itemList.get(i).get(0);
          int parentID = itemList.get(i).get(1);
          for(int j=0;j<itemList.size();j++){
              if(i != j){
                  int childID_1 = itemList.get(j).get(0);
                  int parentID_1 = itemList.get(j).get(1);
                  if(childID == childID_1 && parentID != parentID_1){
                     count++; 
                  }
              }
          }
            if(count == 1){
                childWithOnlyParent.add(childID) ;
            }
        }
        System.out.println(childWithOnlyParent);
        return childWithOnlyParent;
    }
}