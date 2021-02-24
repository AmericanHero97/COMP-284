// TenThousandDaysOld.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-9

Write an application that computes and displays the day on which you become(or became) 10,000 days old. For example, if you were born on January 1st, 2000, the output would be I will be 10000 days old on 2027-05-19.

*/

import java.time.*;

public class TenThousandDaysOld {
    public static void main(String[] args) {
        LocalDate BirthDate = LocalDate.of(2000, 1, 1);
        final int OFFSET = 10000;

        System.out.println("I will be " + OFFSET + " days old on " + BirthDate.plusDays(OFFSET));
    }
}