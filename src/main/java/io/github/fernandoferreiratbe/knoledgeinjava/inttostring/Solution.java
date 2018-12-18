package io.github.fernandoferreiratbe.knoledgeinjava.inttostring;

public class Solution {
    public static void main(String[] args) {
        int n = 100;

        String s = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good Job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
