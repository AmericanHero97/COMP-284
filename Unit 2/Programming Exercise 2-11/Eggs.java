// Eggs.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-11

Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation using the following wording: You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.

*/

import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Eggs you want >> ");
        int eggs = inputService.nextInt();
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;
        final double total = ((eggs/12)*PRICE_PER_DOZEN) + ((eggs%12)*PRICE_PER_EGG);

        System.out.println("You ordered " + eggs + " eggs. That's " + eggs/12 + " dozen at $" + PRICE_PER_DOZEN + " per dozen and " + eggs%12 + " loose eggs at 45 cents for a total of $" + total + ".");
    }
}