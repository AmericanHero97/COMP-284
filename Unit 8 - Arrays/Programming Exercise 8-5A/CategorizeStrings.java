// CategorizeStrings.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-5A

Write an application that accepts up to 20 Strings, or fewer if the user enters the terminating value ZZZ. Store each String in one of two lists:

one list for short Strings that are 10 characters or fewer,
and another list for long Strings that are 11 characters or more.
After data entry is complete, prompt the user to enter which type of String list to display, either S for short or L for long and then output the correct list.

For this exercise, you can assume that if the user does not request the list of short strings, the user wants the list of long strings. If a requested list has no Strings, output The list is empty. Prompt the user continuously until a sentinel value, ZZZ, is entered to quit the program.

An example of the program is shown below:

Enter a string or ZZZ to quit >> Green 
Enter a string or ZZZ to quit >> Green eggs
Enter a string or ZZZ to quit >> Green eggs and ham
Enter a string or ZZZ to quit >> I do not like green eggs and ham
Enter a string or ZZZ to quit >> ZZZ

Do you want to see the list of short strings or the list of long strings?
   Please enter S or L or ZZZ to quit >> S

Green
Green eggs

Do you want to see the list of short strings or the list of long strings?
   Please enter S or L or ZZZ to quit >> L

Green eggs and ham
I do not like green eggs and ham

Do you want to see the list of short strings or the list of long strings?
   Please enter S or L or ZZZ to quit >> ZZZ

*/

import java.util.*;
public class CategorizeStrings {
    public static void main (String[] args) {
        Scanner InputService = new Scanner(System.in);

        final int MAX = 20;
        final int CUTOFF = 10;
        final String QUIT_KEY = "ZZZ";

        String input;
        int shortS = 0;
        int longS = 0;
        String[] longStrings = new String[MAX];
        String[] shortStrings = new String[MAX];


        System.out.print("Enter a string or " + QUIT_KEY + " to quit >> ");
        input = InputService.nextLine();

        while (!input.equals(QUIT_KEY) && ((shortS + longS) < MAX)) {
            if (input.length() <= CUTOFF) {
                shortStrings[shortS] = input;
                shortS++;
            } else {
                longStrings[longS] = input;
                longS++;
            }

            if((shortS + longS) < MAX) {
                System.out.print("Enter a string or " + QUIT_KEY + " to quit >> ");
                input = InputService.nextLine();
            }
        }

        System.out.println("\nDo you want to see the list of short strings or the list of long strings?");
        System.out.print("   Please enter S or L or " + QUIT_KEY + " to quit >> ");
        input = InputService.nextLine();

        while (!input.equals(QUIT_KEY)) {
            if (input.substring(0, 1).equals("S"))
                display(shortStrings, shortS);
            else
                display(longStrings, longS);

            System.out.println("\nDo you want to see the list of short strings or the list of long strings?");
            System.out.print("   Please enter S or L or " + QUIT_KEY + " to quit >> ");
            input = InputService.nextLine();
        }
    }

    public static void display (String[] array, int max) {
        System.out.println();
        if (max == 0)
            System.out.println("The list is empty");
        else
            for (int i = 0; i < max; i++)
                System.out.println(array[i]);
    }
}