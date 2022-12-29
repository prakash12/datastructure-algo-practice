package bitmanipulation;

public class EncodedArrayXOR {
    public static void main(String[] args) {
        int encoded[]={1,2,3};
        int first =1;
        decode(encoded,first);
    }
    public static int[] decode(int[] encoded, int first) {
        int originalArray[] = new int[encoded.length+1];
        originalArray[0] = first;
        for(int i=0;i<encoded.length;i++){

            originalArray[i+1] = encoded[i] ^ originalArray[i];
        }
        return originalArray;
    }
}
