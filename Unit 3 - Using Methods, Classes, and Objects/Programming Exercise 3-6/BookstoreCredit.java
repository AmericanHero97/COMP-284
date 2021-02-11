// BookstoreCredit.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-6

To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times the student’s grade point average.

In other words, a student with a 3.2 grade point average receives a $32.0 credit.

Create an application that prompts a student for a name and grade point average, and then passes the values to a method (computeDiscount) that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and computes and displays the credit.

An example of the program is shown below:

Enter your name >> John
Enter your gpa >> 3.4
John, your  GPA is 3.4, so your credit is $34.0

*/

import java.util.Scanner;

public class BookstoreCredit {
    public static void main (String args[]) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Enter your name >>");
        String NameGiven = inputService.nextLine();
        System.out.println("Enter your gpa >>");
        double GPAGiven = inputService.nextDouble();

        computeDiscount(NameGiven, GPAGiven);
    }

    public static void computeDiscount(String name, double gpa) {
        final int GPA_CREDIT_MULTIPLIER = 10;
        double Credit = gpa * GPA_CREDIT_MULTIPLIER;

        System.out.print(name + ", your GPA is " + gpa + ", so your credit is $" + Credit);
    }
}