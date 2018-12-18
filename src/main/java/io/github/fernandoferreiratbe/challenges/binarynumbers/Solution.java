package io.github.fernandoferreiratbe.challenges.binarynumbers;

public class Solution {
    private static void findBinary(int number) {

        String binaryValue = Integer.toBinaryString(number);
        int temp = 0;
        int bits = 0;

        for(char bit : binaryValue.toCharArray()) {
            if( bit == '1') {
                temp++;

                if (temp > bits) {
                    bits = temp;
                }
                continue;
            }
            temp = 0;
        }

        System.out.println(binaryValue + " - " + bits + "-bits");
    }

    public static void main(String[] args) {
        int firstTest  = 5;
        int secondTest = 13;
        int thirdTest  = 524275;
        int fourth     = 65535;
        int fifth      = 439;

        Solution.findBinary(firstTest);
        Solution.findBinary(secondTest);
        Solution.findBinary(thirdTest);
        Solution.findBinary(fourth);
        Solution.findBinary(fifth);
    }
}
