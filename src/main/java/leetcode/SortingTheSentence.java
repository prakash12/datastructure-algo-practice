package leetcode;

import java.util.Arrays;
import java.util.List;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
      /* String [] ss = s.split(" ") ;
       Arrays.sort(ss);
        for (String x: ss
             ) {
            System.out.println(x);
        }*/
    }
    public static String sortSentence(String s) {
        String[] sb = s.split(" ");
        for(int i =0;i<sb.length;i++){
            String temp = sb[i];
            StringBuffer p = new StringBuffer();
        p.append(temp.charAt(temp.length()-1)).append(temp, 0,temp.length()-1);
        sb[i] = p.toString();
        }
        Arrays.sort(sb);
        StringBuffer result = new StringBuffer();
        for(int i=0; i<sb.length;i++){
            sb[i] = sb[i].substring(1,sb[i].length());
        }
        List<String> strList = Arrays.asList(sb);
        return String.join(" ", strList);
    }

    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
}
