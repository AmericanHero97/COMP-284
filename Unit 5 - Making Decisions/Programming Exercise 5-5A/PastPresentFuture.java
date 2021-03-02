// PastPresentFuture.Java - Iakov Taranenko - 3/2/2021

/* 

Programming Exercise 5-5A

Write an application that prompts a user for a month, day, and year. Then display the appropriate message:

YYYY is not this year
MM was a month earlier this year
MM is a month later this year
MM is this month
An example of the program is shown below:

Enter a month >> 05
Enter a day >> 23
Enter a year (four digits) >> 2021
5 is a month later this year

*/

import java.util.*;
import java.time.*;

public class PastPresentFuture {
    public static void main (String args[]) {
        Scanner InputService = new Scanner(System.in);
        LocalDate Today = LocalDate.now();
        int TodaysMonth = Today.getMonthValue();
        int TodaysDay = Today.getDayOfMonth();
        int TodaysYear = Today.getYear();
        

        System.out.print("Enter a month >> ");
        int month = InputService.nextInt();
        System.out.print("Enter a day >> ");
        int day = InputService.nextInt();
        System.out.print("Enter a year (four digits) >> ");
        int year = InputService.nextInt();

        if (year != TodaysYear) {
            System.out.println(year + " is not this year");
        } else {
            if (month < TodaysMonth) {
                System.out.println(month + " was a month earlier this year");
            } else if (month > TodaysMonth) {
                System.out.println(month + " is a month later this year");
            } else {
                System.out.println(month + " is this month");
            }
        }
    }
}