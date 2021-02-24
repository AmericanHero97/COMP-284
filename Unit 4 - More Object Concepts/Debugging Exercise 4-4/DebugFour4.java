// DebugFour4.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-4

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugFour4 {
    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.90;
        int price = 100;
        double price2 = 100.00;

        tenPercentOff(price, DISCOUNT_RATE);
        tenPercentOff(price2, DISCOUNT_RATE);
    }

    public static void tenPercentOff(int p, final double DISCOUNT_RATE) {
        double newPrice = p * DISCOUNT_RATE;
        System.out.println("Ten percent off "  + p);
        System.out.println("  New price is " + newPrice);
    }

    public static void tenPercentOff(double p, final double DISCOUNT_RATE) {
        double newPrice = p * DISCOUNT_RATE;
        System.out.println("Ten percent off " + p);
        System.out.println("  New price is " + newPrice);
    }
}