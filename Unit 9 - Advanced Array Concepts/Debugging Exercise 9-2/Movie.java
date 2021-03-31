// Movie.Java - Iakov Taranenko - 3/30/2021

/* 

Debugging Exercise 9-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// stores information about a movie
public class Movie {
    private String name;
    private int year;

    Movie (String s, int y) {
        name = s;
        year = y;
    }

    public String getName() { 
        return name;
    }

    public int getYear() {
        return year;
    }
}