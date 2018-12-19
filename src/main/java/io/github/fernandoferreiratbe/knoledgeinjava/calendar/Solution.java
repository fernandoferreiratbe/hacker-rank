package io.github.fernandoferreiratbe.knoledgeinjava.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        System.out.println(calendar.getTime());

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            case Calendar.SUNDAY:
                return "SUNDAY";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.findDay((8-1), 5, 2015));
    }
}
