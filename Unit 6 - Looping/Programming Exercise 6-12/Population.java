// Population.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-12

Assume that the population of Mexico is 128 million and that the population increases 1.01 percent annually. Assume that the population of the United States is 323 million and that the population is reduced 0.15 percent annually.

Write an application that displays the populations for the two countries every year until the population of Mexico exceeds that of the United States, and display The population of Mexico will exceed the U.S. population in X years

*/

public class Population {
    public static void main(String[] args) {
    double mexicoPop = 128;
    double usPop = 323;
    int year = 0;

    // your code here

    System.out.println("The population of Mexico will exceed the U.S. population in " + year + " years");
    System.out.println("The population of Mexico will be " + mexicoPop + " million");
    System.out.println("and the population of the U.S. will be " + usPop + " million");
    }
}