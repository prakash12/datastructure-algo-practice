package leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int []digits = {1,2,3};
        int []digits1 = {4,3,2,2};
        int []digits2 = {9};
        plusOne(digits2);
    }
    public static int[] plusOne(int[] digits) {
        int sum =0;
        for(int i=0;i<digits.length;i++){
            sum = sum*10 + digits[i];
        }
        sum = sum+1;
       String str = String.valueOf(sum);
        int len = str.length();
        digits = new int[len];
       for(int i=0;i<len;i++){
            digits[i] = Integer.parseInt(Character.toString(str.charAt(i)));
        }

        return digits;
    }
}
