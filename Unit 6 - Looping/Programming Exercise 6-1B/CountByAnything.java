// CountByAnything.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-1B

Modify the CountByFives application from Chapter 6 Programming Exercise 1A so that the user enters the value to count by. Start each new line after 10 values have been displayed.

*/

public class CountByAnything {
   public static void main (String args[]) {
      final int START = 5;
      final int STOP = 500;
      final int NUMBER_PER_LINE = 50;
      
      for (int i = START; i <= STOP; i += START) {
         System.out.print(i + "  ");

         if (i % NUMBER_PER_LINE == 0)
            System.out.println();
      }
   }
}