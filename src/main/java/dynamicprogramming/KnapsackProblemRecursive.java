package dynamicprogramming;

public class KnapsackProblemRecursive {

    public static int knapsack(int []w, int v[],int wt,int n){
        //Base condition
        if(n == 0 || wt == 0){
            return 0;
        }
        //Choice logic
        if(w[n-1] <=wt){
            return Math.max(v[n-1]+knapsack(w,v,wt-w[n-1],n-1),knapsack(w,v,wt,n-1));
        }else if(w[n-1] > wt){
            return knapsack(w,v,wt,n-1);
        }
        return 0;
    }
}
