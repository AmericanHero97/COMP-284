// Factorials.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-3

Write an application that displays the factorial for every integer value from 1 to 10. A factorial of a number is the product of that number multiplied by each positive integer lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. The output would then be The factorial of 4 is 24.

*/

public class Factorials {
    public static void main (String args[]) {
        final int MAX = 10;
        int factorial;

        for (int i = 1; i <= MAX; i++) {
            factorial = i;

            for (int j = i - 1; j > 0; --j) {
                factorial = factorial * j;
                System.out.println("The factorial of " + i + " is " + factorial);
            }
        }
    }
}