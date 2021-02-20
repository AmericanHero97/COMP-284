// SammysRentalPriceWithMethods.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

1. a. Sammy's Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists. In Chapter 2, you wrote an application that prompts the user for the number of minutes a piece of sports equipment was rented, displays the company motto with a border, and displays the price for the rental. Now modify the program so that the main() method contains only three executable statements that each call a method as follows:

-The first executable statement calls a method that prompts the user for the rental time in minutes and returns the value to the main() method.
-The second executable statement calls a method that displays the company motto with the border.
-The last executable statement passes the number of minutes to a method that computes the hours, extra minutes, and price for the rental, and then displays all the details.

Save the file as SammysRentalPriceWithMethods.java.

*/

import java.util.Scanner;

class SammysRentalPriceWithMethods {
    public static void main(String[] args) {
        int minutes;

        minutes = getMinutes();
        RentalDemo.displayMotto();
        displayDetails(minutes);
    }

    public static int getMinutes() {
        Scanner InputService = new Scanner(System.in);

        int minutes;
        minutes = InputService.nextInt();

        return minutes;
    }

    public static void displayDetails(int minutes) {
        final int MINS_PER_HOUR = 60;
        final int PRICE_PER_HOUR = 40;
    
        int hours;
        int extraMinutes;
        double totalPrice;

        hours = minutes / MINS_PER_HOUR;
        extraMinutes = minutes % MINS_PER_HOUR;
        totalPrice = hours * PRICE_PER_HOUR + extraMinutes;

        System.out.println("Your order: "
            + "\n Hours: " + hours
            + "\n Minutes: " + extraMinutes
            + "\n Total Price: $" + totalPrice);
    }
}