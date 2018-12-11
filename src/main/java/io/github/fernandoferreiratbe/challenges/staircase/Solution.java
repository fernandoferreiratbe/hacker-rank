package io.github.fernandoferreiratbe.challenges.staircase;

public class Solution {
    public static void main(String[] args) {
        int degree = 100;
        int helper = 1;

        for(int i = 1; i <= degree; i++) {
            int difference = degree - helper;

            for (int j = difference; j > 0; j--) {
                System.out.print(" ");
            }
            for (int h = helper; h > 0; h--) {
                System.out.print("#");
            }

            System.out.println("");
            helper++;
        }

//        int temp = 1;
//
//        for(int i = 1; i <= degree; i++) {
//            do {
//                System.out.print("#");
//                temp++;
//            } while (temp <= i);
//
//            System.out.println("");
//            temp = 1;
//        }
    }
}
