// CarCareChoice.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-3A

Write an application for Cody’s Car Care Shop that shows a user a list of available services: oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds to one of the options, and display the option and its price as $25, $22, $15, or $5, accordingly. Display Invalid Entry if the user enters an invalid item.

An example of the program is shown below:

Enter selection:
   oil change
   tire rotation
   battery check
   brake inspection
battery check
battery check price is $15

*/

import java.util.*;
public class CarCareChoice {
    public static void main (String[] args) {
        Scanner InputService = new Scanner(System.in);
        String[] selection = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        System.out.println("Enter selection:");
        for (int i = 0; i < selection.length; i++)
            System.out.println("    " + selection[i]);

        String input = InputService.nextLine();

        for (int i = 0; i < selection.length; i++) {
            if (input.equals(selection[i])) {
                System.out.println(input + " price is $" + prices[i]);
                break;
            } else if (i == (selection.length - 1)) {
                System.out.println("Invalid Entry");
            }
        }
    }
}