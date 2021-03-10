// RetirementGoal2.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-10B

Modify the RetirementGoal application from Chapter 6 Exercise 10A to display the amount of money the user will have if the user earns 4% interest on the balance every year.

An example of the program is shown below:

How many years until retirement? >> 5
How much can you save annually? >> 1200
If you save $1200 for 5 years without interest, you will have $6000
If you save $1200 for 5 years, with 4.0% interest, you will have $6759.570554880001

*/

import java.util.Scanner;
public class RetirementGoal2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int years;
        int saveAmount;
        int total;
        final double RATE;

        System.out.print("How many years until retirement? >> ");
        years = input.nextInt();
        while (years <= 0) {
            System.out.println("Years cannot be 0 or negative");
            System.out.print("Please renter years >> ");
            years = input.nextInt();
        }  

        System.out.print("How much can you save annually? >> ");
        saveAmount = input.nextInt();
        while (saveAmount <= 0) {
            System.out.println("Amount cannot be 0 or negative");
            System.out.print("Please renter amount to save annually >> ");
            saveAmount = input.nextInt();
        }  

        total = saveAmount * years;
        System.out.println("If you save $" + saveAmount + " for " + years + " years without interest, you will have $" + total);
        double total2 = 0;
        for (int y = 0; y < years; ++y) {
            total2 += saveAmount;
        }

        System.out.println("If you save $" + saveAmount + " for " + years + " years, with " + (RATE * 100) + "% interest, you will have $" + total2);
    }
}