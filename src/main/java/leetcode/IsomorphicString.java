package leetcode;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("badc","baba"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length()){
            for(int i =0; i<s.length();i++){
                s = s.replace(s.charAt(i),t.charAt(i));

            }
        }else{
            return false;
        }
        if(t.equals(s))
            return true;
        else
            return false;
    }
}
