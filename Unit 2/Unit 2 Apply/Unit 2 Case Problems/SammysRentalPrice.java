// SammysRentalPrice.java - Iakov Taranenko - 2/9/2021

/* 

Unit 2 Case Problems

Sammy's Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists. Write a program that prompts the user for the number of minutes he rented a piece of sports equipment. Compute the rental cost as $40 per hour plus $1 per additional minute. (You might have surmised already that this rate has a logical flaw, but for now, calculate rates as described here. You can fix the problem after you read the chapter on decision making.) Display Sammy's motto with the border that you created in the SammysMotto2 class in Chapter 1. Then display the hours, minutes, and total price. Save the file as SammysRentalPrice.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

import java.util.Scanner;
public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        final double HOURLY_RATE = 40;
        final double MINUTE_RATE = 1;

        System.out.println("Number of minutes to rent equipment >> ");
        int MinutesRenting = inputService.nextInt();

        int HoursRenting = MinutesRenting/60;
        int ExtraMinutes = MinutesRenting%60;
        double TotalPrice = (HoursRenting * HOURLY_RATE) + (ExtraMinutes * MINUTE_RATE);

        System.out.println("Total price: $" + TotalPrice);
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy’s makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("Hours: " + HoursRenting);
        System.out.println("Minutes: " + ExtraMinutes);
        System.out.println("Total price: $" + TotalPrice);
    }
}