package io.github.fernandoferreiratbe.challenges.arrays;

public class Solution {

    static void reverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 4, 3, 2};

        Solution.reverse(numbers);
    }
}
