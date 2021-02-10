// MadLib.java - Iakov Taranenko - 2/9/2021

/* 

Unit 2 Game Zone

Mad Libs is a children's game in which they provide a few words that are then incorporated into a silly story. The game helps children understand different parts of speech because they are asked to provide specific types of words. For example, you might ask a child for a noun, another noun, an adjective, and a past-tense verb. The child might reply with such answers as table, book, silly, and studied. The newly created Mad Lib might be:

Mary had a little table

Its book was silly as snow

And everywhere that Mary studied

The table was sure to go.

Create a zip file of the .java file(s) and submit the assignment.

*/

import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Chose a country >> ");
        String FirstInput = inputService.nextLine();
        System.out.println("Chose a type of vehicle >> ");
        String SecondInput = inputService.nextLine();
        System.out.println("Chose a place >> ");
        String ThirdInput = inputService.nextLine();
        System.out.println("Chose a flavour >> ");
        String FourthInput = inputService.nextLine();
        System.out.println("Chose a plural noun >> ");
        String FifthInput = inputService.nextLine();
        System.out.println("Chose a number >> ");
        String SixthInput = inputService.nextLine();
        System.out.println("Chose a number >> ");
        String SeventhInput = inputService.nextLine();
        System.out.println("Chose a verb >> ");
        String EighthInput = inputService.nextLine();


        System.out.println("Your very own mad lib:");
        System.out.println("My family and I love to vacation in " + FirstInput + ".");
        System.out.println("We take the " + SecondInput + " to the " + ThirdInput + ",");
        System.out.println("and eat " + FourthInput + "-covered " + FifthInput + " by the shore!");
        System.out.println("Sometimes we stay " + SixthInput + " days.");
        System.out.println("Other times we vacation at for " + SeventhInput + " days!");
        System.out.println("I like to take photos with my family so I can " + EighthInput + " back on the memories!");
    }
}