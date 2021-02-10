// CarlysEventPrice.java - Iakov Taranenko - 2/9/2021

/* 

Unit 2 Case Problems

Carly's Catering provides meals for parties and special events. Write a program that prompts the user for the number of guests attending an event and then computes the total price, which is $35 per person. Display the company motto with the border that you created in the CarlysMotto2 class in Chapter 1, and then display the number of guests, price per guest, and total price. Also display a message that indicates true or false depending on whether the job is classified as a large event—an event with 50 or more guests. Save the file as CarlysEventPrice.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

import java.util.Scanner;
public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        final int PRICE_PER_PERSON = 35;

        System.out.println("Number of guests attending >> ");
        int GuestsAttending = inputService.nextInt();
        System.out.println("Total price: $" + (GuestsAttending * PRICE_PER_PERSON));

        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
        System.out.println("Guests attending: " + GuestsAttending);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + (GuestsAttending * PRICE_PER_PERSON));
        System.out.println("Is this a large event? " + (GuestsAttending >= 50) + "!");
    }
}