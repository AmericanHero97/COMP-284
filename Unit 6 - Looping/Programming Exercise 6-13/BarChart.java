// BarChart.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-13

The Huntington High School basketball team has five players named Art, Bob, Cal, Dan, and Eli. Accept the number of points scored by each player in a game and create a bar chart that illustrates the points scored by displaying an asterisk for each point. The output looks similar to the chart in Figure 6-34.

*/

import java.util.Scanner;

public class BarChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;

        System.out.print("Enter points earned by Art >> ");
        artPoints = input.nextInt();
        System.out.print("Enter points earned by Bob >> ");
        bobPoints = input.nextInt();
        System.out.print("Enter points earned by Cal >> ");
        calPoints = input.nextInt();
        System.out.print("Enter points earned by Dan >> ");
        danPoints = input.nextInt();
        System.out.print("Enter points earned by Eli >> ");
        eliPoints = input.nextInt();
        System.out.println("\nPoints for Game\n");

        drawChart("Art", artPoints);
        drawChart("Bob", bobPoints);
        drawChart("Cal", calPoints);
        drawChart("Dan", danPoints);
        drawChart("Eli", eliPoints);
    }

    public static void drawChart(String name, int points) {
        System.out.print(name + "  ");

        for (int i = 0; i < points; ++i)
            System.out.print("*");

        System.out.println();
    }
}