// DebugPlay.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugPlay {
    protected String title;
    protected String author;

    public DebugPlay(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
    System.out.println("The performance is " + title + " by " + author);
    }
}