package leetcode;

public class Defanged {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static  String defangIPaddr(String address) {
        String split[] = address.split("\\.");
        return address.replace(".","[.]");
    }

    public static  int numJewelsInStones(String jewels, String stones) {
        if(stones.length()>50) return -1;
        int count =0;
        for(int i = 0; i< stones.length();i++ ){

            for(int j =0;j<jewels.length();j++){
                int comp = Character.compare(jewels.charAt(j), stones.charAt(i));
                if(comp == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
