// BarChart2.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-14

Modify the BarChart program from Chapter 6 Exercise 13 to accept the number of points scored by each player in a season. The bar chart displays one asterisk for each 10 points scored by a player. For example, if a player has scored 48 points, then display 4 asterisks.

An example of the program is shown below:

Enter points earned for the season
    by Art >> 10
    by Bob >> 20
    by Cal >> 30
    by Dan >> 40
    by Eli >> 50

Points for Season (each asterisk represents 10 points)

Art  *
Bob  **
Cal  ***
Dan  ****
Eli  *****

*/

import java.util.Scanner;

public class BarChart2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;
        final int AMT_EACH_ASTERISK = 10;

        System.out.println("Enter points earned for the season");
        System.out.print("    by Art >> ");
        artPoints = input.nextInt();
        System.out.print("    by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("    by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("    by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("    by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Season (each asterisk represents " + AMT_EACH_ASTERISK + " points)\n");

        drawChart("Art", artPoints, AMT_EACH_ASTERISK);
        drawChart("Bob", bobPoints, AMT_EACH_ASTERISK);
        drawChart("Cal", calPoints, AMT_EACH_ASTERISK);
        drawChart("Dan", danPoints, AMT_EACH_ASTERISK);
        drawChart("Eli", eliPoints, AMT_EACH_ASTERISK);   
    }
    public static void drawChart(String name, int points, int amt_each) {
        points = points/amt_each;
        System.out.print(name + "  ");

        for (int x = 0; x < points; ++x)
            System.out.print("*");

        System.out.println();
    }
}