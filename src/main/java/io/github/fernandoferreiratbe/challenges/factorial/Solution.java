package io.github.fernandoferreiratbe.challenges.factorial;

public class Solution {
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Solution.factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.printf("factorial(%d) =  %d%n", number, Solution.factorial(number));
    }
}
