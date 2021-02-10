// DebugThree1.Java - Iakov Taranenko - 2/10/2021

/* 

Debugging Exercise 3-1

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1 {
   public static void main(String args[]) {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calctip(yourcheck);
    }
    public void calcTip(double bill)
    {
       final double RATE = 0.15;
       double tip;
       tip = check * RATE;
       System.out.println("The tip should be at least " + tip);
    }
}