// InchConversion.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-7

Modify the class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. One converts the value from inches to feet, and the other converts the same value from inches to yards.

There are 12 inches in a foot and 3 feet in a yard.

Each method displays the results with appropriate explanation.

An example of the program is shown below:

Enter inches >> 430
430 inches is 35.833333333333336 feet
430 inches is 11.944444444444445 yards

*/

import java.util.Scanner;

public class InchConversion {
    public static void main (String args[]) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Enter inches >> ");
        int InchesInputted = inputService.nextInt();

        convertToFeet(InchesInputted);
        convertToYards(InchesInputted);
    }

    public static void convertToFeet(int inches) {
        final double INCHES_IN_FOOT = 12;
        
        System.out.println(inches + " inches is " + (inches / INCHES_IN_FOOT) + " feet");
    }

    public static void convertToYards(int inches) {
        final double INCHES_IN_YARD = 36;
        
        System.out.println(inches + " inches is " + (inches / INCHES_IN_YARD) + " yards");
    }
}