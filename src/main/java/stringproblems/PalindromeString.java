package stringproblems;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba",0,2));
        System.out.println(isPalindrome("nitin",0,4));
        System.out.println(isPalindrome("a",0,0));
        System.out.println(isPalindrome("ab",0,1));
        powerSet("abc",0," ");
    }
    public static boolean isPalindrome(String str, int l, int r){
        if(l >= r){
            return  true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return isPalindrome(str, l+1, r-1);
    }

    public static void powerSet(String s,int i, String current){
        if(i == s.length()){
            System.out.print(current+",");
            return;
        }
        powerSet(s,i+1,current+s.charAt(i));
        powerSet(s,i+1,current);
    }
}
