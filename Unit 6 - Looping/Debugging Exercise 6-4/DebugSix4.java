// DebugSix4.Java - Iakov Taranenko - 3/9/2021

/* 

Debugging Exercise 6-4

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.Scanner;

public class DebugSix4 {
    public static void main(String[] args) {
        int high, low, count = 0;
        final int NUM = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("This application displays " + NUM + " random numbers" + "\nbetween the low and high values you enter" + "\nEnter low value now... ");
        low = input.nextInt();

        System.out.print("Enter high value... ");
        high = input.nextInt();

        while(low > high)  {
            System.out.println("The number you entered for a high number, " +  high + ", is not more than " + low);
            System.out.print("Enter a number higher than " + low + "... ");
            high = input.nextInt();
        }

        while(count < NUM) {
            double result = Math.random();
            int answer = (int) (result * 10 + low);

            if(answer <= high) {
                System.out.print(answer + "  ");
                ++count;
            }
        }

        System.out.println("End of Application");
    }
}