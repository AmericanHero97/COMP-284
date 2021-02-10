// InchesToFeet.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-8

Write a program that declares a variable named inches, which holds a length in inches, and assign a value. Display the value in feet and inches; for example: 86 inches is 7 feet and 2 inches. Be sure to use a named constant where appropriate.

When submitting the program for testing/grading, assign the value 86 to inches.

*/

class InchesToFeet {
    public static void main(String[] args) {
        final int inches = 86;
        final int INCHES_IN_FOOT = 12;

        System.out.println(inches + " inches is " + inches/INCHES_IN_FOOT + " feet and " + inches%INCHES_IN_FOOT + " inches");
    }
}