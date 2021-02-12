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
      name = getName();

      displayGreeting(name);           
   }
   public static String getName() {
      Scanner input = new Scanner(System.in);
      String name;
      
      System.out.print("Enter name ");
      name = input.nextLine();
      return name;
   }
   public static void displayGreeting(String name) {
      System.out.println("Hello, " + name + "!");
   }
}