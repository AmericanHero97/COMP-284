// MileConversionsInteractive.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-7

Convert the MileConversions program to an interactive application. Instead of assigning a value to the miles variable, accept it from the user as input.

An example of the program is show below:

Enter miles >> 4.5
4.5 miles is 285120.0 inches, or 23760.0 feet, or 7920.0 yards

*/

import java.util.Scanner;
class MileConversionsInteractive {
   public static void main(String[] args) {
      Scanner inputService = new Scanner(System.in);

      final double INCHES_IN_MILE = 63360;
      final double FEET_IN_MILE = 5280;
      final double YARDS_IN_MILE = 1760;
      System.out.println("Enter miles >> ");
      double miles = inputService.nextDouble();
      double in, ft, yds;
      in = miles * INCHES_IN_MILE;
      ft = miles * FEET_IN_MILE;
      yds = miles * YARDS_IN_MILE;
      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}