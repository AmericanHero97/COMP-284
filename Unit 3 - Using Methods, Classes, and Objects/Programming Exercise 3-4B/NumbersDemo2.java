// NumbersDemo2.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-4B

Modify the NumbersDemo2 class to accept the values of the two integers from a user at the keyboard.

An example of the program is shown below:

Enter an integer >> 2
Enter another integer >> 17
2 times 2 is 4
2 plus 5 is 7
2 squared is 4
17 times 2 is 34
17 plus 5 is 22
17 squared is 289

*/

import java.util.Scanner;

public class NumbersDemo2 {
   public static void main (String args[]) {
      Scanner inputService = new Scanner(System.in);

      System.out.println("Enter an integer >> ");
      int num1 = inputService.nextInt();
      System.out.println("Enter another integer >> ");
      int num2 = inputService.nextInt();

      displayTwiceTheNumber(num1);
      displayNumberPlusFive(num1);
      displayNumberSquared(num1);
      displayTwiceTheNumber(num2);
      displayNumberPlusFive(num2);
      displayNumberSquared(num2);
   }
   public static void displayTwiceTheNumber(int n)
   {
      final int FACTOR = 2;
      System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
   }
   public static void displayNumberPlusFive(int n)
   {
      final int FACTOR = 5;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
   }
   public static void displayNumberSquared(int n)
   {
      System.out.println(n + " squared is " + (n * n)); 
   }
}