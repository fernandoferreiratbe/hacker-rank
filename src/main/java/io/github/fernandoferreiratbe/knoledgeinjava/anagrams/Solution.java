package io.github.fernandoferreiratbe.knoledgeinjava.anagrams;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.isAnagram("CAT", "ATc"));
    }

    static boolean isAnagram(String a, String b) {
        char[] firstWord = a.trim().toLowerCase().toCharArray();
        char[] secondWord = b.trim().toLowerCase().toCharArray();

        if (a.length() != b.length()) {
            return false;
        }

        for (char value: firstWord) {
            int counterA = 0;
            int counterB = 0;
            for (char charValue : firstWord) {
                if (value == charValue) {
                    counterA++;
                }
            }

            for (char charValue : secondWord) {
                if (value == charValue) {
                    counterB++;
                }
            }

            if (counterA != counterB) {
                return false;
            }
        }
        return true;
    }
}
