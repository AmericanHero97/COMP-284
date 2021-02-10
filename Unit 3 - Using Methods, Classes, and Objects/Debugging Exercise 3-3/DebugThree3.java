// DebugThree3.Java - Iakov Taranenko - 2/10/2021

/* 

Debugging Exercise 3-3

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// This application gets a user's name and displays a greeting
import java.util.Scanner;

public class DebugThree3 {
   public static void main(String args[]) {
      String name;
      name = getName()
      displayGreeting(namme);           
   }
   public static String getName(void) {
      String name;
      Scanner input = new Scanner(System.in);
      System.in.print("Enter name ");
      name = input.nexlLine();
      return namer;
   }
   public static displayGreeting(String name) {
      System.outprintln("Hello, " + name + "!");
   }
}