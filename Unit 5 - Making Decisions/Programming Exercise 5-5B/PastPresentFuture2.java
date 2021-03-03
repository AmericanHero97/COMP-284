// PastPresentFuture2.Java - Iakov Taranenko - 3/2/2021

/* 

Programming Exercise 5-5B

Use the web to learn how to use the LocalDate Boolean methods isBefore(), isAfter(), and equals(). Use your knowledge to write the PastPresentFuture2 program that prompts a user for a month, day, and year, and then displays a message specifying whether the entered day is in the past, is today (the current date), or is in the future.

An example of the program is shown below:

Enter a month >> 10
Enter a day >> 23
Enter a year (four digits) >> 2021
2021-10-23 is in the future

*/

import java.util.*;
import java.time.*;

public class PastPresentFuture2 {
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
        LocalDate Date = LocalDate.of(year, month, day);

        if (Date.isBefore(Today)) {
            System.out.println(Date + " is in the past");
        } else if (Date.equals(Today)) {
            System.out.println(Date + " is today");
        } else {
            System.out.println(Date + " is in the future");
        }
    }
}