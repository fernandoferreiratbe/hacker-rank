package io.github.fernandoferreiratbe.challenges.birthdaycakecandles;


import java.util.Arrays;


public class Solution {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int candles = 0;

        for (int i = ar.length; i > 0; i--) {
            if (ar[ar.length-1] == ar[i-1]) {
                candles++;
            }
        }

        return candles;
    }
    public static void main(String[] args) {
        int tallestCandles = Solution.birthdayCakeCandles(new int[] {3, 2, 1, 3});

        System.out.println("How many tallest candles my niece can blows out: " + tallestCandles);
    }
}
