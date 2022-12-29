package leetcode;

public class CompareStringArray {
    public static void main(String[] args) {
        String s1[]={"a","bc"}; String s2[]={"ab","c"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb1.append(word2[i]);
        }

        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}
