// DebugTen2.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class DebugTen2 {
    public static void main(String args[]) {
        DebugVacation myVacation = new DebugVacation();
        DebugExtendedVacation yourVacation = new DebugExtendedVacation();

        System.out.println("My vacation is for " + myVacation.getDays() + " days");
        System.out.println("Your vacation is for " + yourVacation.getDays() + " days");
    }
}