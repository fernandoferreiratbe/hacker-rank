package io.github.fernandoferreiratbe.challenges.staircase;

public class Solution {
    public static void main(String[] args) {
        int degree = 100;
        int helper = 1;

        for(int i = 1; i <= degree; i++) {
            int padding = degree - helper;

            for (int j = padding; j > 0; j--) {
                System.out.print(" ");
            }
            for (int h = helper; h > 0; h--) {
                System.out.print("#");
            }

            System.out.println("");
            helper++;
        }
    }
}
