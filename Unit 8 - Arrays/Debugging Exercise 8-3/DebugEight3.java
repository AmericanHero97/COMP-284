// DebugEight3.Java - Iakov Taranenko - 3/23/2021

/* 

Debugging Exercise 8-3

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.*;
public class DebugEight3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        char[] floorPlans = {'A','B','C','a','b','c'};
        int[] pricesInThousands = {145, 190, 235};
        int fp = 99;

        String prompt = "Please select a floor plan\n" +
        "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
        "B - Brittany, a split level\n" +
        "C - Colonial, a two-story\n" +
        "Enter floorPlans letter";
        System.out.println(prompt);
        String entry = input.next();
        char plan = entry.charAt(0);

        for (int i = 0; i < floorPlans.length; i++)
            if (plan == floorPlans[i])
                fp = i;

        if (fp == 99)
            System.out.println("Invalid floor plan code entered");
        else {
            if (fp >= (floorPlans.length / 2))
                fp = fp - (floorPlans.length / 2);

            System.out.println("Model " + plan + " is priced at only $" + pricesInThousands[fp] + ",000");
        }
    }
}