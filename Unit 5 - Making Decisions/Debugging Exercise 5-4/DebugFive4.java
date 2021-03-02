// DebugFive4.Java - Iakov Taranenko - 3/1/2021

/* 

Debugging Exercise 5-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int one, two, three, four;
        String str, output;

        System.out.println("Enter an integer");
        str = input.next();
        one = Integer.parseInt(str);

        System.out.println("Enter an integer");
        str = input.next();
        two = Integer.parseInt(str);

        System.out.println("Enter an integer");
        str = input.next();
        three = Integer.parseInt(str);

        System.out.println("Enter an integer");
        str = input.next();
        four = Integer.parseInt(str);

        if (one > two && one > three && one > four) {
            output = "Highest is " + one;
        } else if (two > one && two > three && two > four) {
            output = "Highest is " + two;
        } else if (three > one && three > two && three > four) {
            output = "Highest is " + three;
        } else {
            output = "Highest is " + four;
        }
        System.out.println(output);
    }
}