// DebugSix3.Java - Iakov Taranenko - 3/9/2021

/* 

Debugging Exercise 6-3

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.*;

public class DebugSix3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userNumString;

        int userNum, val;
        final int MIN = 1;
        final int MAX = 20;

        System.out.println("Enter a number between " + MIN + " and " + MAX + " inclusive");
        userNumString = input.next();
        userNum = Integer.parseInt(userNumString);

        while (userNum < MIN || userNum > MAX) {
            System.out.println("Number out of range" + "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
            userNumString = input.next();
            userNum = Integer.parseInt(userNumString);
        }

        for (val = userNum; val > 0; --val) {
            System.out.print(val + "  ");

            for(int x = 0; x < 100000; ++x)
                for(int y = 0; y < 10000; ++y);
        }

        System.out.println("Blastoff!");
    }
}