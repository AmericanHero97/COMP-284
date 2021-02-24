// DaysTilNextMonth.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-10

The LocalDate class includes an instance method named lengthOfMonth() that returns the number of days in the month. Write an application that uses methods in the LocalDate class to calculate how many days are left until the first day of next month. Display the result in accordance with this example: There are 16 days until MAY starts.

*/

import java.time.*;
import java.util.Scanner;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        LocalDate CurrentDay = LocalDate.now();
        int DaysUntilNextMonth = CurrentDay.lengthOfMonth() - CurrentDay.getDayOfMonth();

        System.out.println("Today is " + CurrentDay);
        System.out.println("There are " + DaysUntilNextMonth + " days until " + CurrentDay.plusMonths(1).getMonth() + " starts.");
    }
}