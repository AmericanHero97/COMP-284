// TwelveDays.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-10

Below are the lyrics for the song “The Twelve Days of Christmas.” The song contains a list of gifts received for the holiday. The list is cumulative so that as each “day” passes, a new verse contains all the words of the previous verse, plus a new item.

On the 12th day of Christmas
My true love gave to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three French hens
Two turtle doves and
A partridge in a pear tree
Implement the TwelveDays application that displays the words to the song starting with any day the user enters. (Hint: Use a switch statement with cases in descending day order and without any break statements so that the lyrics for any day repeat all the lyrics for previous days.)

An example of the program is shown below:

From what day do you want to start the song The Twelve Days of Christmas?

>> 5

On the 5th day of Christmas
My true love gave to me
Five golden rings
Four calling birds
Three French hens
Two turtle doves and
A partridge in a pear tree

*/

import java.util.*;

public class TwelveDays {
    public static void main (String args[]) {
        int dayCount;
        String endingThing;
        dayCount = getChoice();

        if (dayCount >= 4) {
            endingThing = "th";
        } else if (dayCount == 3) {
            endingThing = "rd";
        } else if (dayCount == 2) {
            endingThing = "nd";
        } else {
            endingThing = "st";
        }

        System.out.println("\nOn the " + dayCount + endingThing + " day of Christmas\n" + "My true love gave to me");

        switch(dayCount) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
            default:
                System.out.println("wrongggggg");
        }
    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("From what day do you want to start the song The Twelve Days of Christmas?\n >> ");
        return (input.nextInt());
    }
}