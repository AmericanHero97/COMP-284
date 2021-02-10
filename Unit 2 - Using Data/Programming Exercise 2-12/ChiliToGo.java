// ChiliToGo.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-12

The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price is $7.00 for an adult meal and $4.00 for a child’s meal. Write a program that accepts the number of adult meals ordered and then children's meals ordered. Display the total money collected for adult meals, children’s meals, and all meals.

An example of the program is shown below:

Enter number of adult meals ordered >> 10
Enter number of child meals ordered >> 5
10 adult meals were ordered at 7.0 each.
      Total is 70.0
5 child meals were ordered at 4.0 each.
      Total is 20.0
Grand total for all meals is 90.0

*/

import java.util.Scanner;
class ChiliToGo {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Enter number of adult meals ordered >> ");
        int adultMeals = inputService.nextInt();
        final double ADULT_MEAL_PRICE = 7.0;
        System.out.println("Enter number of child meals ordered >> ");
        int childMeals = inputService.nextInt();
        final double CHILD_MEAL_PRICE = 4.0;

        final double adultTotal = adultMeals*ADULT_MEAL_PRICE;
        final double childTotal = childMeals*CHILD_MEAL_PRICE;
        final double total = adultTotal + childTotal;

        System.out.println(adultMeals + " adult meals were ordered.");
        System.out.println("    Total is " + adultTotal);

        System.out.println(childMeals + " child meals were ordered.");
        System.out.println("    Total is " + childTotal);

        System.out.println("Grand total for all meals is " + total);
    }
}