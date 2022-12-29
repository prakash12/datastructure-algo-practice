package arraysample;

import java.util.HashSet;

public class ConsistentString {
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings("abc",words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(String word: words){
            boolean found = true;
            for(Character ch : word.toCharArray()){
                if(!set.contains(ch)){
                    found = false;
                }
            }
            if(found) count++;
        }
        return count;
    }
}
