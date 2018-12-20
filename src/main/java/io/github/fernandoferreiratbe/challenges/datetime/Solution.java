package io.github.fernandoferreiratbe.challenges.datetime;

public class Solution {

    private static String timeConversion(String time) {
        String[] data = time.split(":");
        StringBuilder timeConversion = new StringBuilder();

        if (data[2].contains("PM")) {
            if (Integer.parseInt(data[0]) < 12) {
                data[0] = String.valueOf(Integer.parseInt(data[0]) + 12);
            }
        } else {
            if (data[0].equals("12")) {
                data[0] = "00";
            }
        }

        return timeConversion
                .append(data[0])
                .append(":")
                .append(data[1])
                .append(":")
                .append(data[2].replace("PM", "").replace("AM", ""))
                .toString();
    }
    public static void main(String[] args) {
        String postMidnight  = Solution.timeConversion("07:05:45PM");
        String afterMidnight = Solution.timeConversion("12:05:39AM");
        String noon          = Solution.timeConversion("12:45:54PM");

        System.out.println(postMidnight);
        System.out.println(afterMidnight);
        System.out.println(noon);

    }
}
