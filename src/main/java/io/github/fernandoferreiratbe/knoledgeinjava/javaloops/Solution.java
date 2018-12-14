package io.github.fernandoferreiratbe.knoledgeinjava.javaloops;

public class Solution {

    private static void multiply(int number) {
        for(int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", number, i, (number * i));
        }
    }
    public static void main(String[] args) {
        int N = 2;

        if (args.length > 0) {
            N = Integer.parseInt(args[0]);
        }

        Solution.multiply(N);
    }
}
