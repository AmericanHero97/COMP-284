// Dollars.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-14

Write a program that calculates and displays the conversion of an entered number of dollars into currency denominations—20s, 10s, 5s, and 1s. Example output: $452 converted is 22 $20s, 1 $10s, 0 $5s, and 2 $1s.

*/

import java.util.Scanner;
class Dollars {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);
        
        System.out.println("How much money would you like to convert >> ");
        int money = inputService.nextInt();
        final int TWENTIES = (money/20);
        final int TENS = (money%20)/10;
        final int FIVES = (money%10)/5;
        final int ONES = (money%5)/1;

        System.out.println("$" + money + " converted is " + TWENTIES + " $20s, " + TENS+ " $10s, " + FIVES + " $5s, and " + ONES + " $1s");
    }
}