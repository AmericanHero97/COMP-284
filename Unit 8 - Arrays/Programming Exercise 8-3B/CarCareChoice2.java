// CarCareChoice2.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-3B

It might not be reasonable to expect users to type long entries such as “oil change” accurately. Implement the CarCareChoice2 class so that as long as the user enters the first three characters of a service, the choice is considered valid.

An example of the program is shown below:

Enter selection:
   oil change
   tire rotation
   battery check
   brake inspection
batry check
batry check price is $15

*/

import java.util.*;
public class CarCareChoice2 {
    public static void main (String[] args) {
        Scanner InputService = new Scanner(System.in);
        String[] selection = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        System.out.println("Enter selection:");
        for (int i = 0; i < selection.length; i++)
            System.out.println("    " + selection[i]);

        String input = InputService.nextLine();

        for (int i = 0; i < selection.length; i++) {
            if (input.substring(0, 3).equals(selection[i].substring(0, 3))) {
                System.out.println(input + " price is $" + prices[i]);
                break;
            } else if (i == (selection.length - 1)) {
                System.out.println("Invalid Entry");
            }
        }
    }
}