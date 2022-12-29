package arraysample;

public class PowerSet {

    public static void main(String[] args) {
        powerSet("abc",-1,"");
    }

    public static void powerSet(String str, int index, String current){
      int n = str.length();
      if(index == n){ // Base condition
          return;
      }
        System.out.println(current);
      for(int i=index+1;i<n;i++){
          current += str.charAt(i);
          powerSet(str, i,current);
          current = current.substring(0, current.length() - 1);
      }
      return;
    }
}
