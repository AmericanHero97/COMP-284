// EvenOdd.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-1

Implement the EvenOdd application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd.

An example of the program is shown below:

Enter a number >> 372
372 is even

*/

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        int number = InputService.nextInt();

        if (isEven(number))
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }

    public static boolean isEven(int number) {
        return !((number % 2) == 1);
    }
}