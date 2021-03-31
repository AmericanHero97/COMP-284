// DayOfWeek.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-8

Create an application that contains an enumeration that represents the days of the week. Display a list of the days, and then prompt the user for a day. Display business hours for the chosen day. Assume that the business is open from 11 - 5 on Sunday, 9 - 9 on weekdays, and 10 - 6 on Saturday.

The program should accept input values in the format SUN, MON, TUE, WED, THU, FRI, SAT.

An example of the program is shown below:

The days are:
SUN MON TUE WED THU FRI SAT 

Enter the day code to find our hours >> MON
You entered MON
On MON our hours are 9 - 9

*/

import java.util.Scanner;
public class DayOfWeek {
    enum Day {SUN, MON, TUE, WED, THU, FRI, SAT};

    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        String[] times = {"11 - 5", "9 - 9", "10 - 6"};

        System.out.println("The days are:");
        for (Day i : Day.values())
            System.out.print(i + " ");

        System.out.print("\nEnter the day code to find our hours >> ");
        String input = InputService.nextLine().toUpperCase();
        System.out.println("You entered " + input);

        if (Day.valueOf(input).ordinal() == 0) {
            System.out.println("On " + input + " our hours are " + times[0]);
        } else if (Day.valueOf(input).ordinal() == 6) {
            System.out.println("On " + input + " our hours are " + times[2]);
        } else {
            System.out.println("On " + input + " our hours are " + times[1]);
        }
    }
}