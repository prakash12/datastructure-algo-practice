package chandra.hackerrank.problems;

import java.util.Arrays;

public class Staircase {
    public static void main(String[] args) {
       drawStairCase(6);
    }

    static void drawStairCase(int height){
        for(int i = 0; i<height; i++){
            for(int x = i+1; x < height; x++){
                System.out.print(" ");
            }
            for(int x = height-(i+1); x < height; x++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
