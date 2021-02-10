// DebugTwo4.Java - Iakov Taranenko - 2/2/2021

/* 

Debugging Exercises 2-4

The file provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.*;
public class DebugTwo4 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String costString;
      double cost;
      final double TAX = 0.06;

      System.out.println("Enter price of item you are buying");
      costString = input.next();
      cost = Double.parseDouble(costString);

      System.out.println("With " + (TAX * 100) + "% tax, purchase is $" + (cost + (cost * TAX)));
   }
}