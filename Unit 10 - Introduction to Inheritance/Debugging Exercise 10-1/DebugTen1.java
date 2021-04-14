// DebugTen1.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// A Play has a title and author
// A Musical is a Play that also has a composer

public class DebugTen1 {
    public static void main(String args[]) {
        DebugPlay performance1 = new 
        DebugPlay("Death of a Salesman", "Arthur Miller");
        DebugMusical performance2 = new 
        DebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");
        
        performance1.display();
        performance2.display();
    }
}