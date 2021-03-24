// DebugEight1.Java - Iakov Taranenko - 3/23/2021

/* 

Debugging Exercise 8-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.*;
public class DebugEight1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry, message;
        boolean found = false;
        char[] okayCodes = {'A', 'C', 'T', 'H'};

        StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");


        for(int i = 0; i < okayCodes.length; i++) {
            prompt.append(okayCodes[i]);

            if (i != (okayCodes.length - 1))
                prompt.append(", ");     
        }
        System.out.println(prompt);
        entry = input.next();
        userCode = entry.charAt(0);
        for (int i = 0; i < okayCodes.length; i++) {
            if (userCode == okayCodes[i])
                found = true;
        }

        if (found)
            message = "Good code";
        else
            message = "Sorry code not found";

        System.out.println(message);
    }
}