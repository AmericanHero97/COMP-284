// CategorizeStrings2.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-5B

Implement the CategorizeStrings2 application to divide the entered Strings into those that contain no spaces, one space, or more. After data input is complete, continuously prompt the user to enter the type of String to display: O for one word Strings, T for two word Strings, and L for longer Strings. If the user does not enter one of the three valid choices, display all of the Strings. Allow the user to enter ZZZ to quit.

An example of the program is shown below:

Enter a string or ZZZ to quit >> Green
Enter a string or ZZZ to quit >> Green eggs 
Enter a string or ZZZ to quit >> Green eggs and ham
Enter a string or ZZZ to quit >> ZZZ 

Do you want to see the list of
    one-word strings, two-word strings, or longer strings?
   Please enter O, T, or L, or ZZZ to quit >> L

List of longer strings:
Green eggs and ham

Do you want to see the list of
    one-word strings, two-word strings, or longer strings?
   Please enter O, T, or L, or ZZZ to quit >> ZZZ

*/

import java.util.*;
public class CategorizeStrings2 {
    public static void main (String[] args) {
        Scanner InputService = new Scanner(System.in);

        final int MAX = 20;
        final int CUTOFF = 10;
        final String QUIT_KEY = "ZZZ";

        String input;
        int spaces;
        int firstS = 0;
        int secondS = 0;
        int thirdS = 0;
        String[] oneWord = new String[MAX];
        String[] twoWords = new String[MAX];
        String[] threeWords = new String[MAX];


        System.out.print("Enter a string or " + QUIT_KEY + " to quit >> ");
        input = InputService.nextLine();

        while (!input.equals(QUIT_KEY) && ((firstS + secondS + thirdS) < MAX)) {
        spaces = 0;

        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == ' ')
                spaces++;
        }

        if (spaces == 0) {
            oneWord[firstS] = input;
            firstS++;
        } else
            if (spaces == 1) {
                twoWords[secondS] = input;
                secondS++;
            } else {
                threeWords[thirdS] = input;
                thirdS++;
            }

            if (firstS + secondS + thirdS < MAX) {
                System.out.print("Enter a string or " + QUIT_KEY + " to quit >> ");
                input = InputService.nextLine();
            }
        }

        System.out.println("\nDo you want to see the list of" + "\n    one-word strings," + " two-word strings, or longer strings?");
        System.out.print("   Please enter O, T, or L, or " + QUIT_KEY + " to quit >> ");
        input = InputService.nextLine();

        while(!input.equals(QUIT_KEY))  {
            String letter = input.substring(0, 1).toLowerCase();

            if (letter.equals("o")) {
                display(oneWord, firstS, "one-word");
            } else {
                if (letter.equals("t")) {
                    display(twoWords, secondS, "two-word");
                } else {
                    if (letter.equals("l")) {
                        display(threeWords, thirdS, "longer");
                    } else {
                        display(oneWord, firstS, "one-word");
                        display(twoWords, secondS, "two-word");
                        display(threeWords, thirdS, "longer");
                    }
                }
            }

            System.out.println("\nDo you want to see the list of" + "\n    one-word strings," + " two-word strings, or longer strings?");
            System.out.print("   Please enter O, T, or L, or " + QUIT_KEY + " to quit >> ");
            input = InputService.nextLine();
        }
    }

    public static void display(String[] array, int max, String text) {
        System.out.println("\nList of " + text + " strings:");

        if (max == 0)
            System.out.println("The list is empty");
        else
            for (int i = 0; i < max; i++)
                System.out.println(array[i]); 
   }
}