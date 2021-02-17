// CarlysEventPriceWithMethods.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

a. Carly's Catering provides meals for parties and special events. In Chapter 2, you wrote an application that prompts the user for the number of guests attending an event, displays the company motto with a border, and then displays the price of the event and whether the event is a large one. Now modify the program so that the main() method contains only three executable statements that each call a method as follows:

-The first executable statement calls a public static int method that prompts the user for the number of guests and returns the value to the main() method.
-The second executable statement calls a public static void method that displays the company motto with the border.
-The last executable statement passes the number of guests to a public static void method that computes the price of the event, displays the price, and displays whether the event is a large event.

Save the file as CarlysEventPriceWithMethods.java.

*/

import java.util.Scanner;

class CarlysEventPriceWithMethods {
    public static int GetGuestsAttending() {
        Scanner InputService = new Scanner(System.in);

        System.out.print("Guests attending >> ");
        int GuestsAttending = InputService.nextInt();

        return GuestsAttending;
    }

    public static String GetEventNumber() {
        Scanner InputService = new Scanner(System.in);

        System.out.print("Event Number >> ");
        String EventNumber = InputService.nextLine();

        return EventNumber;
    }

    public static void DisplayMotto() {
        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
    }

    public static void CalculateParty(Event Event) {
        System.out.println("Guests attending: " + Event.getGuestsAttending());
        System.out.println("Total price: $" + Event.getTotalPrice());
        System.out.println("Is this a large event? " + (Event.getGuestsAttending() >= 50) + "!");
    }
}