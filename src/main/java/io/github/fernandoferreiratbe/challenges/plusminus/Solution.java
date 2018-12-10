package io.github.fernandoferreiratbe.challenges.plusminus;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[] { -4, 3, -9, 0, 4, 1 };
        double pCounter = 0.;
        double nCounter = 0.0;
        double zCounter = 0.0;

        for (int number : numbers) {
            if (number > 0) {
                pCounter++;
            }
            if (number < 0) {
                nCounter++;
            }
            if (number == 0) {
                zCounter++;
            }
        }

        System.out.println("Positive found: " + pCounter);
        System.out.println("Negative found: " + nCounter);
        System.out.println("Zero found: " + nCounter);

        DecimalFormat df = new DecimalFormat("0.000000");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format((pCounter / numbers.length)));
        System.out.println(df.format((nCounter / numbers.length)));
        System.out.println(df.format((zCounter / numbers.length)));
    }
}
