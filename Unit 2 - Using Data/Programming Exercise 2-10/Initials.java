// Initials.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-10

Write a program that declares variables named init1, init2, and init3, to hold your three initials. Display the three initials with a period following each one, as in J.M.F.

When submitting the program for testing/grading, assign the values J, M, and F to init1, init2, init3, respectively.

*/

class Initials {
    public static void main(String[] args) {
        char init1 = 'J';
        char init2 = 'M';
        char init3 = 'F';

        System.out.println(init1 + "." + init2 + "." + init3 + ".");
    }
}
