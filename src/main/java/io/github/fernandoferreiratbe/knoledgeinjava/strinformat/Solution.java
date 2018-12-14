package io.github.fernandoferreiratbe.knoledgeinjava.strinformat;

public class Solution {
    public static void main(String[] args) {
        /*
        ================================
        java           100
        cpp            065
        python         050
        ================================
         */
        String java = "java";
        int jvalue = 100;

        String cpp = "cpp";
        int cvalue = 65;

        String python = "python";
        int pvalue = 50;

        System.out.printf("%-15s%0,3d%n", java, jvalue);
        System.out.printf("%-15s%0,3d%n", cpp, cvalue);
        System.out.printf("%-15s%0,3d%n", python, pvalue);
    }
}
