// QuartsToGallonsInteractive.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-5

Convert the QuartsToGallons program to an interactive application. Instead of assigning a value to the number of quarts, accept the value from the user as input.

An example of the program is shown below:

Enter quarts needed >> 20
A job that needs 20 quarts requires 5 gallons plus 0 quarts.

*/

import java.util.Scanner;
class QuartsToGallonsInteractive {
   public static void main(String[] args) 
   {   
      // Modify the code below
      Scanner inputService = new Scanner(System.in);

      final int QUARTS_IN_GALLON = 4;
      System.out.println("Enter quarts needed:");
      int quartsNeeded = inputService.nextInt();
      int gallonsNeeded;
      int extraQuartsNeeded;
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts."); 
   }
}