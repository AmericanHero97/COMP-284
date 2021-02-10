// InchesToFeetInteractive.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-9

Implement an interactive version of the InchesToFeet class that accepts the inches value from a user.

An example of the program is shown below:

Enter inches >> 200
200 inches is 16 feet and 8 inches

*/

import java.util.Scanner;
class InchesToFeetInteractive {    
  public static void main(String[] args) {
     Scanner inputService = new Scanner(System.in);

     final int INCHES_IN_FOOT = 12;
     System.out.println("Enter inches >> ");
     int inches = inputService.nextInt();
     int feet;
     int inchesLeft;
     feet = inches / INCHES_IN_FOOT;
     inchesLeft = inches % INCHES_IN_FOOT;
     System.out.println(inches + " inches is " +
        feet + " feet and " + inchesLeft + " inches"); 
  }
}