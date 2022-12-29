package leetcode;

class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet"; int indices[] = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
       StringBuffer sb= new StringBuffer();
       StringBuffer sb1 = new StringBuffer(s);
       for(int i=0;i<indices.length;i++){
           sb = sb.append(sb1.charAt(indices[i]));
       }
        
        return sb.toString();
    }
}