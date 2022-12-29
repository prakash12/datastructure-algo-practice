package leetcode;

public class AfterPerformingOperation {
    public static void main(String[] args) {
        String operations[] = {"X++","++X","--X","X--"};
        String operations1[] = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
        System.out.println(finalValueAfterOperations(operations1));
    }
    public static int finalValueAfterOperations(String[] operations) {
        if(operations.length == 0) return 0;
        int X =0;
        for(int i=0;i<operations.length;i++){
           if(operations[i].equals("++X") || operations[i].equals("X++")){
             X += 1;
           }
           /*if(operations[i].equals("X++")){
               X +=1;
           }*/
           if(operations[i].equals("--X") || operations[i].equals("X--")){
               X -=1;
           }
           /*if(operations[i].equals("X--")){
               X -=1;
           }*/
        }

        return X;
    }
}
