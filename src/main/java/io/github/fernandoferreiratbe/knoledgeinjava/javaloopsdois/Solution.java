package io.github.fernandoferreiratbe.knoledgeinjava.javaloopsdois;

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int number = 5;
        // 5 3 5
        // (a + 2expN * b)
        for (int i = 1; i <= number; i++) {
            int sum = 0;

            for(int j = 0; j < i; j++) {
                double pow = Math.pow(2, j);
                sum += (int)(a + pow * b);
            }
            System.out.print(sum + " ");
        }
    }
}
