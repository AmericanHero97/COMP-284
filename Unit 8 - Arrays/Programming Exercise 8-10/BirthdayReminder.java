// BirthdayReminder.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-10

Write an application that allows a user to enter the names and birthdates of up to 10 friends. Continue to prompt the user for names and birthdates until the user enters the sentinel value ZZZ for a name or has entered 10 names, whichever comes first. When the user is finished entering names, produce a count of how many names were entered, and then display the names. In a loop, continuously ask the user to type one of the names and display the corresponding birthdate or "Sorry, no entry for name" if the name has not been previously entered. The loop continues until the user enters ZZZ for a name.

An example of the program is shown below:

Enter a name
Lan
Enter birthdate with slashes between the month, day, and year
12/25/1983
Enter a name or ZZZ to quit
Marylouise
Enter birthdate with slashes between the month, day, and year
2/20/1992
Enter a name or ZZZ to quit
Arminda
Enter birthdate with slashes between the month, day, and year
8/30/1992
Enter a name or ZZZ to quit
Gudrun
Enter birthdate with slashes between the month, day, and year
9/30/1994
Enter a name or ZZZ to quit
ZZZ

Count of names entered: 4
Lan
Marylouise
Arminda
Gudrun

Enter a name to search for
ZZZ

*/

import java.util.*;
public class BirthdayReminder {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);

        final int MAX = 10;
        final String QUIT_KEY = "ZZZ";
        String[] names = new String[MAX];
        String[] birthdates = new String[MAX];
        int count = 0;
        String input;
        boolean matchFound = false;

        System.out.println("Enter a name");
        input = InputService.nextLine();
        names[count] = input;

        while ((count < names.length) && !(input.equals(QUIT_KEY))) {
            System.out.println("Enter birthdate with slashes between the month, day, and year");
            input = InputService.nextLine();
            birthdates[count] = input;
            count++;

            if (count < names.length) {
                System.out.println("Enter a name or " + QUIT_KEY + " to quit");
                input = InputService.nextLine();
                names[count] = input;
            }
        }

        System.out.println("Count of names entered: " + count);
        for (int i = 0; i < count; i++)
            System.out.println(names[i]);
        
        System.out.println("Enter a name to search for");
        input = InputService.nextLine();

        while (!input.equals(QUIT_KEY)) {
            matchFound = false;

            for (int i = 0; i < count; i++)
                if (input.equals(names[i])) {
                    matchFound = true;
                    System.out.println(names[i] + "'s birthdate is " + birthdates[i]);
                }
            
            if (!matchFound)
                System.out.println("Sorry, no entry for " + input + "\nEnter a name to search for or " + QUIT_KEY + " to quit");
            else
                System.out.println("Enter a name to search for or " + QUIT_KEY + " to quit");

            input = InputService.nextLine();
        }
    }
}