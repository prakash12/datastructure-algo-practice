package leetcode;

public class FirstPalindromeInArray {
    public static void main(String[] args) {
        String []s = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(s));
    }
    public static String firstPalindrome(String[] words) {
        for(int i =0; i<words.length;i++){
            String s1 = words[i];
            StringBuffer sb = new StringBuffer();
            int l = s1.length();
            while(l != 0){
                sb = sb.append(s1.charAt(l-1));
                l--;
            }
            if(s1.equals(sb.toString())){
                return s1;
            }

        }
        return "";
    }
}
