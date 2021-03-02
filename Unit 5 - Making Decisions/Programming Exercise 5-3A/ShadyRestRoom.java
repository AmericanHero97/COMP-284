// ShadyRestRoom.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-3A

Write an application for the Shady Rest Room; the program determines the price of a room. Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch. The output echoes the input and displays the price of the room: $125 for queen, $139 for king, and $165 for suite with king bed and a pullout couch. If the user enters an invalid code, display You selected an invalid option and set the price to 0.

An example of the program is shown below:

Menu

(1) Queen bed
(2) King bed
(3) Suite with a king bed and pull-out couch
Enter Selection (1, 2, or 3) >> 1
You selected Queen bed  $125

*/

import java.util.Scanner;

public class ShadyRestRoom {
    public static void main (String args[]) {
        Scanner InputService = new Scanner(System.in);
        System.out.print("Menu"
                            + "\n"
                            + "\n (1) Queen bed"
                            + "\n (2) King bed"
                            + "\n (3) Suite with a king bed and pull-out couch"
                            + "\n Enter Selection (1, 2, or 3) >> ");
        int choice = InputService.nextInt();
        
        final int QUEEN_PRICE = 125;
        final int KING_PRICE = 139;
        final int SUITE_PRICE = 165;
        int totalPrice;

        switch (choice) {
            case 1:
                totalPrice = QUEEN_PRICE;
                System.out.println("You selected Queen bed  $" + totalPrice);
                break;
            case 2:
                totalPrice = KING_PRICE;
                System.out.println("You selected King bed  $" + totalPrice);
                break;
            case 3:
                totalPrice = SUITE_PRICE;
                System.out.println("You selected Suite with a king bed and pull-out couch  $" + totalPrice);
                break;
            default:
                totalPrice = 0;
                System.out.println("You selected an invalid option  $" + totalPrice);
                break;
        }
    }
}