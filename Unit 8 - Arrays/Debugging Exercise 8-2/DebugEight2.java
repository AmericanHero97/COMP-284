// DebugEight2.Java - Iakov Taranenko - 3/23/2021

/* 

Debugging Exercise 8-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugEight2 {
    public static void main(String args[]) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;

        for (int i = 0; i < someNums.length; i++)
            tot += someNums[i];

        System.out.println("Sum is " + tot);
        System.out.println("Average is " + tot * 1.0 / someNums.length);
    }
}