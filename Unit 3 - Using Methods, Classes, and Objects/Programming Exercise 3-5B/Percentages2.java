// Percentages2.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-5B

Modify the Percentages class to accept the values of the two doubles from a user at the keyboard.

An example of the program is shown below:

Enter a double >> 2.5
Enter another double >> 5
2.5 is 50.0 percent of 5.0
5.0 is 200.0 percent of 2.5

*/

import java.util.Scanner;

public class Percentages2 {
   public static void main (String args[]) {
      Scanner inputService = new Scanner(System.in);

      System.out.println("Enter a double >> ");
      double num1 = inputService.nextDouble();
      System.out.println("Enter another double >> ");
      double num2 = inputService.nextDouble();

      computePercent(num1, num2);
      computePercent(num2, num1);
   }

   public static void computePercent(double x, double y) {
       System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
   }
}