// PaintCalculator.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-8

Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following:

Calculates the wall area for a room
Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed
Displays the number of gallons needed
Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
Returns the price to the main() method
The main() method displays the final price. For example:

You will need 2.0 gallons
The price to paint the room is $64.0

*/

import java.util.Scanner;

public class PaintCalculator {
    public static void main (String args[]) {
        Scanner inputService = new Scanner(System.in);
        final double PRICE_PER_GALLON = 32.0;

        System.out.print("Enter room length >> ");
        double RoomLength = inputService.nextDouble();
        System.out.print("Enter room width >> ");
        double RoomWidth = inputService.nextDouble();
        System.out.print("Enter room Height >> ");
        double RoomHeight = inputService.nextDouble();

        double WallSize = computeArea(RoomLength, RoomWidth, RoomHeight);
        double GallonsNeeded = computeGallons(WallSize);
        double TotalPrice = GallonsNeeded * PRICE_PER_GALLON;

        System.out.println("You will need " + GallonsNeeded + " gallons");
        System.out.println("The price to paint the room is $" + TotalPrice);
    }

    public static double computeArea(double length, double width, double height) {
        double LengthWall = length * height;
        double WidthWall = width * height;

        return((LengthWall * 2) + (WidthWall * 2));
    }

    public static double computeGallons(double area) {
        final double FEET_PER_GALLON = 350;

        return(area/ FEET_PER_GALLON);
    }
}