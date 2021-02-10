// RandomGuessMatch.java - Iakov Taranenko - 2/9/2021

/* 

Unit 2 Game Zone

1. In the "Game Zone" section in Chapter 1, you learned how to obtain a random number. For example, the following statement generates a random number between the constants MIN and MAX inclusive and assigns it to a variable named random:

random = MIN + (int)(Math.random() * MAX);

Write a program that selects a random number between 1 and 5 and asks the user to guess the number. Display a message that indicates the difference between the random number and the user's guess. Display another message that displays the random number and the Boolean value true or false depending on whether the user's guess equals the random number. Save the file as RandomGuessMatch.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

import java.util.Scanner;
public class RandomGuessMatch {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 5;

        System.out.println("Guess a number >> ");
        int GuessedNumber = inputService.nextInt();
        int random = MIN + (int)(Math.random() * MAX);

        System.out.println("You guessed " + GuessedNumber + " and the random number was " + random + "!");
        System.out.println("You were off by " + Math.abs(GuessedNumber - random));
        System.out.println("Were you right? " + (GuessedNumber == random) + "!");
    }
}