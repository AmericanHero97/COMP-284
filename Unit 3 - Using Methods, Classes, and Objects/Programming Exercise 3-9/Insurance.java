// Insurance.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-9

The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20.

For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20.

Write an application that prompts a user for the current year then a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount.

An example of the program is shown below:

Enter the current year >> 2020
Enter the birth year >> 2001
The premium is $320

*/

import java.util.Scanner;

class Insurance {
    public static void main (String args[]) {
        Scanner inputService = new Scanner(System.in);

        System.out.print("Enter the current year >> ");
        int CurrentYear = inputService.nextInt();
        System.out.print("Enter the birth year >> ");
        int BirthYear = inputService.nextInt();

        System.out.println("The premium is $" + calculatePremium(CurrentYear, BirthYear));

    }

    public static int calculatePremium(int curr, int birth) {
        int Age = curr - birth;
        int AgeInDecades = Age/10;

        int PremiumPrice = (AgeInDecades + 15) * 20;

        return(PremiumPrice);
    }
}