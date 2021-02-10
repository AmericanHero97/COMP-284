// QuartsToGallons.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-4

Write a program that declares a constant named QUARTS_IN_GALLON which holds the number of quarts in a gallon (4). Also declare a variable named quartsNeeded to represent the number of quarts needed for a painting job, and assign an appropriate value. Compute and display the number of gallons and quarts needed for the job. Display explanatory text with the values—for example, A job that needs 18 quarts requires 4 gallons plus 2 quarts.

When submitting the program for testing/grading, assign the value 18 to quartsNeeded.

*/

class QuartsToGallons {
    public static void main(String[] args) {
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + quartsNeeded/QUARTS_IN_GALLON + " gallons plus " + 2 + " quarts");
    }
}