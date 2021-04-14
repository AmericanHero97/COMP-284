// DebugMusical.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugMusical extends DebugPlay {
    protected String composer;

    DebugMusical(String title, String author, String comp) {
        super(title, author);
        composer = comp;
    }

    public void display() {
    System.out.println("The performance is " + title + " by " + author + "\nThe music for " + title + " is by " + composer);
    }
}