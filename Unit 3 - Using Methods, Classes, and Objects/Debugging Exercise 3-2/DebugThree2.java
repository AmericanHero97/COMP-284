// DebugThree2.Java - Iakov Taranenko - 2/10/2021

/* 

Debugging Exercise 3-2

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// This application displays some math facts
public class DebugThree2 {
   public static void main(String[] args) {
      int a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }

   public static void add(int a,  int b) {
      System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
   }

   public static void subtract(int a, int b) {
      System.out.println("The difference between "  + a + " and " + b + " is " +  (a - b));
   }
}