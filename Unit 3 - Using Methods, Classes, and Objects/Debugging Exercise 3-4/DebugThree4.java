// DebugThree4.Java - Iakov Taranenko - 2/10/2021

/* 

Debugging Exercise 3-4

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// This program calculates tutition bills
// as credits times rate per credit hour
public class DebugThree4 {
   public static void main(String args[]) {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      System.out.println(My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, myCredits);
   }

   public static void TuitionBill(int c, double r) {
      System.out.println("Total due  + (r / c));
   }
}