package io.github.fernandoferreiratbe.challenges.stringsintroduction;

public class Solution {
    public static void main(String[] args) {
        String hello = "hello";
        String java  = "java";

        int length   = (hello.length() + java.length());

        System.out.println(length);

        String result = (hello.compareTo(java) <= 0 ) ? "No" : "Yes";

        System.out.println(result);

        String capitalizeFirst  = String.valueOf(hello.charAt(0));
        String capitalizeSecond = String.valueOf(java.charAt(0));

        System.out.println(
                capitalizeFirst.toUpperCase() + hello.substring(1, hello.length()) +
                " " +
                capitalizeSecond.toUpperCase() + java.substring(1, java.length())
        );

    }
}
