// MinutesConversion.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-15

Write a program that accepts a number of minutes and converts it both to hours and days. For example, 6000 minutes is 100.0 hours or 4.166666666666667 days.

*/

import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Minutes to convert >> ");
        int MinutesEntered = inputService.nextInt();
        final double MINUTES_IN_HOURS = 60;
        final double MINUTES_IN_DAYS = 1440;
        final double MINUTES_TO_DAY = MinutesEntered/MINUTES_IN_HOURS;

        System.out.println(MinutesEntered + " minutes is " + MINUTES_TO_DAY + " hours or " + MinutesEntered/MINUTES_IN_DAYS + " days.");
    }
}