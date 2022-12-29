package leetcode;

public class Atio {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("0032"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));

    }

    public static int myAtoi(String s) {
        if(s==null) return 0;
        long result = 0;
        s = s.trim();
        if (s.length() == 0) return 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int isnegative = +1;
        if(s.charAt(0) == '-') {
            isnegative = -1;
        }
        int i= (s.charAt(0)=='-' || s.charAt(0)=='+') ? 1:0;
        for (; i < s.length(); i++) {
           if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
           result = result*10 + (s.charAt(i)-'0');;
           if(isnegative == -1 && isnegative*result < min) return min;
           if(isnegative == +1 && isnegative*result > max) return max;
        }

        return (int) (isnegative*result);


    }
}
