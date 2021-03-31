// DebugNine2.Java - Iakov Taranenko - 3/30/2021

/* 

Debugging Exercise 9-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// sorts an array of movies by name or year
import java.util.*;
public class DebugNine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie[] movies = new Movie[8];
        int i;
        String message, entry;
        movies[0] = new Movie("The Godfather", 1972);
        movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
        movies[2] = new Movie("Pulp Fiction", 1994);
        movies[3] = new Movie("Shindler's List", 1993);
        movies[4] = new Movie("Casablanca", 1942);
        movies[5] = new Movie("Wizard of Oz", 1939);
        movies[6] = new Movie("Citizen Kane", 1941);
        movies[7] = new Movie("Some Like It Hot", 1959);

        System.out.println( "Sort Movies by\n(N)ame, or (Y)ear");
        entry = input.next();
        if (entry.charAt(0) == 'N') {
            nameSort(movies);
            message = "Sorted by Name\n";
        } else {
            yearSort(movies);
            message = "Sorted by Year\n";
        }

        display(movies, message);
    }

    public static void nameSort(Movie[] array) {
        int a, b;
        Movie temp;
        int highSub = array.length - 1;

        for (a = 0; a < highSub; ++a) {
            for (b = 0; b < highSub; ++b) {
                String first = array[b].getName();
                String second = array[b + 1].getName();

                if (first.compareTo(second) > 0)  {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void yearSort(Movie[] array) {
        int a, b;
        Movie temp;
        int highSub = array.length - 1;

        for (a = 0; a < highSub; ++a) {
            for (b = 0; b < highSub; ++b) {
                if (array[b].getYear() > array[b + 1].getYear()) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void display(Movie[] s,  String msg) {
        int len = s.length;
        
        for (int i = 0; i < len; i++)
           msg = msg + s[i].getName() + ", " + s[i].getYear() + "\n";

        System.out.println(msg);
    }
}