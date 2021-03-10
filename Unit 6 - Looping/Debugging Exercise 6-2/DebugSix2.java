// DebugSix2.Java - Iakov Taranenko - 3/9/2021

/* 

Debugging Exercise 6-2

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugSix2 {
    public static void main(String args[]) {
        char letter;
        int a;

        final int MIN = 65;
        final int MAX = 122;
        final int NUMPERLINE = 200;
        final int STOPLINE1 = 0;
        final int STOPLINE2 = STOPLINE1 + NUMPERLINE;

        for (a = MIN; a <= MAX; a++) {
            letter = (char)a;
            System.out.print("  " + letter);

            if ((a == STOPLINE1) || (a == STOPLINE2))
                System.out.println();
        }
        
        System.out.println("\nEnd of application");
    }
}