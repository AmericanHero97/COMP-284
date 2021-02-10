// ChiliToGoProfit.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-13

In the ChiliToGo program in Exercise 12, the costs to produce an adult meal and a child’s meal are $4.35 and $3.10, respectively. Adult meals are sold for $7.00 and children's meals are sold for $4.00. Modify the ChiliToGo program to display the total profit for each type of meal as well as the grand total profit.

An example of the program is shown below:

Enter number of adult meals ordered >> 10
Enter number of child meals ordered >> 5
10 adult meals were ordered at 7.0 each.
      Total is 70.0
5 child meals were ordered at 4.0 each.
      Total is 20.0
Grand total for all meals is 90.0
Profits:
      Adult profit is 26.5
      Child profit is 4.5
Total profit is 31.0

*/

import java.util.Scanner;
class ChiliToGoProfit
{
  public static void main(String[] args) {
      final double ADULT_PRICE = 7;
      final double CHILD_PRICE = 4;
      final double ADULT_PRODUCTION_PRICE = 4.35;
      final double CHILD_PRODUCTION_PRICE = 3.10;
      int adultMeals;
      int childMeals;
      double totalAdult, totalChild, grandTotal;
      double productionAdult, productionChild, productionTotal;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of adult meals ordered >> ");
      adultMeals = input.nextInt();
      System.out.print("Enter number of child meals ordered >> ");
      childMeals = input.nextInt();
      totalAdult = adultMeals * ADULT_PRICE;
      totalChild = childMeals * CHILD_PRICE;
      grandTotal = totalAdult + totalChild;
      productionAdult = adultMeals * ADULT_PRODUCTION_PRICE;
      productionChild = childMeals * CHILD_PRODUCTION_PRICE;
      productionTotal = productionAdult + productionChild;


      System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
      System.out.println("      Total is " + totalAdult);
      System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
      System.out.println("      Total is " + totalChild);
      System.out.println("Grand total for all meals is " + grandTotal);

      System.out.print("Profits:");
      System.out.print("    Adult profit is " + (totalAdult-productionAdult));
      System.out.print("    Child profit is " + (totalChild-productionChild));
      System.out.print("Total profit is " + (grandTotal-productionTotal));
   }
}