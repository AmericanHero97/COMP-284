// DebugSix1.Java - Iakov Taranenko - 3/9/2021

/* 

Debugging Exercise 6-1

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugSix1 {
    public static void main(String args[]) {
        final int DAYS = 30;
        double money = 0.01;
        int day = 1;

        while (day < DAYS) {
            money = 2 * money;
            ++day;

            System.out.println("After day " + day + " you have " + money);
        }
    }
}