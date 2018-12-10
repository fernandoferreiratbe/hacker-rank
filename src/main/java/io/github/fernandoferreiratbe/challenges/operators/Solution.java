package io.github.fernandoferreiratbe.challenges.operators;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        double meal = 12.0;
        int tip = 20;
        int tax = 8;

        double tipValue = (meal * tip) / 100;
        double taxValue = (meal * tax) / 100;

        DecimalFormat df = new DecimalFormat(".##");
        df.setRoundingMode(RoundingMode.UP);

        System.out.println(Math.round((meal + tipValue + taxValue)));
    }
}
