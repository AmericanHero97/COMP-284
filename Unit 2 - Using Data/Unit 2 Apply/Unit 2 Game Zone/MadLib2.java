// MadLib2.java - Iakov Taranenko - 2/9/2021

/* 

Unit 2 Game Zone

1. Create a Mad Libs program that asks the user to provide at least four or five words, and then create and display a short story or nursery rhyme that uses them. Save the file as MadLib.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

import java.util.Scanner;
public class MadLib2 {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Chose a colour >> ");
        String FirstInput = inputService.nextLine();
        System.out.println("Chose an object >> ");
        String SecondInput = inputService.nextLine();
        System.out.println("Chose a place >> ");
        String ThirdInput = inputService.nextLine();
        System.out.println("Chose another place >> ");
        String FourthInput = inputService.nextLine();
        System.out.println("Chose an animal >> ");
        String FifthInput = inputService.nextLine();
        System.out.println("Chose a thing >> ");
        String SixthInput = inputService.nextLine();
        System.out.println("Chose an exclamation >> ");
        String SeventhInput = inputService.nextLine();
        System.out.println("Chose an emotion >> ");
        String EighthInput = inputService.nextLine();


        System.out.println("Your very own nursery rhyme:");
        System.out.println("Little Boy " + FirstInput + ". Come blow your " + SecondInput + ".");
        System.out.println("The sheep's in " + ThirdInput + ". The cow's in " + FourthInput + ";");
        System.out.println("Where is that boy who looks after " + FifthInput + "?");
        System.out.println("Under the " + SixthInput + " fast asleep.");
        System.out.println("Will you wake him?");
        System.out.println("Oh " + SeventhInput + ", not I,");
        System.out.println("For if I do He will surely " + EighthInput + ".");
    }
}