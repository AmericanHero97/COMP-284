// DebugNine4.Java - Iakov Taranenko - 3/30/2021

/* 

Debugging Exercise 9-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.Scanner;
public class DebugNine4 {
    enum Planet {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};

    public static void main(String[] args) {
        Planet planet;
        String userEntry;
        int comparison, position;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a planet in our solar system >> ");
        userEntry = input.nextLine().toUpperCase();
        planet = Planet.valueOf(userEntry);

        System.out.println("You entered " + planet);
        position = planet.ordinal();
        
        System.out.println(planet + " is " + (position + 1) + " planet(s) from the sun");
    }
}