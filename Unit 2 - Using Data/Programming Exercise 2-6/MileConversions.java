// MileConversions.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-6

Write a program that declares constants to represent the number of inches, feet, and yards in a mile. Name the constants INCHES_IN_MILE, FEET_IN_MILE, and YARDS_IN_MILE respectively. Also declare a variable named miles to represent a number of miles. Compute and display, with explanatory text, the value in inches, feet, and yards—for example: 4.0 miles is 253440.0 inches, or 21120.0 feet, or 7040.0 yards

There are 63,360 inches in a mile, 5,280 feet in a mile, and 1,760 yards in a mile.

When submitting the program for testing/grading, assign the value 4 to miles.

*/

class MileConversions {
    public static void main(String[] args) {
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;
        float miles = 4;

        System.out.println(miles + " miles is " + miles*INCHES_IN_MILE + " inches, or " + miles*FEET_IN_MILE + " feet, or " + miles*YARDS_IN_MILE + " yards");
    }
}