// ShadyRestRoom2.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-3B

Add a prompt to the ShadyRestRoom application, from Chapter 5 Programming Exercise 3A, to ask the user to specify a (1) lake view or a (2) park view, but ask only if the bed size entry is valid. Add $15 to the price of any room with a lake view. If the view value entered is invalid display a warning message indicating as such and assume that the price is for a room with a lake view.

An example for the program is shown below:

Menu

(1) Queen bed
(2) King bed
(3) Suite with a king bed and pull-out couch
Enter Selection (1, 2, or 3) >> 1
Please choose a view:
(1) a lake
(2) a park
Enter Selection (1 or 2) >> 2
You selected Queen bed with a park view for $125

*/

import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main (String args[]) {
        Scanner InputService = new Scanner(System.in);

        final int QUEEN_PRICE = 125;
        final int KING_PRICE = 139;
        final int SUITE_PRICE = 165;
        final int LAKE_PRICE = 15;
        final int PARK_PRICE = 0;
        String view = ""; 
        String room = "";
        int totalPrice = 0;

        System.out.print("Menu"
                            + "\n"
                            + "\n (1) Queen bed"
                            + "\n (2) King bed"
                            + "\n (3) Suite with a king bed and pull-out couch"
                            + "\n Enter Selection (1, 2, or 3) >> ");
        int choiceRoom = InputService.nextInt();
        
        System.out.print("Please choose a view:"
                            + "\n (1) a lake"
                            + "\n (2) a park"
                            + "\n Enter Selection (1 or 2) >> ");
        int choiceView = InputService.nextInt();

        if (choiceRoom >= 1 && 3 >= choiceRoom) {
            if (choiceRoom == 1) {
                totalPrice = totalPrice + QUEEN_PRICE;
                room = "Queen bed";
            } else if (choiceRoom == 2) {
                totalPrice = totalPrice + KING_PRICE;
                room = "King bed";
            } else {
                totalPrice = totalPrice + SUITE_PRICE;
                room = "Suite with a king bed and pull-out couch";
            }

            if (choiceView == 1) {
                totalPrice = totalPrice + LAKE_PRICE;
                view = "lake view";
            } else if (choiceView == 2) {
                totalPrice = totalPrice + PARK_PRICE;
                view = "park view";
            } else {
                totalPrice = totalPrice + LAKE_PRICE;
                view = "lake view";
                System.out.println("You selected an invalid option");
            }

            System.out.println("You selected "+ room + " with a " + view + " for $" + totalPrice); 
        } else {
            totalPrice = 0;
            System.out.println("You selected an invalid option  $" + totalPrice);
        }
    }
}