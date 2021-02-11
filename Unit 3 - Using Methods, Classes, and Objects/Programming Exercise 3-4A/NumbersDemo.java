// NumbersDemo.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-4A

Create an application named NumbersDemo whose main() method holds two integer variables. Assign values to the variables.

In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().

Create each method to perform the task its name implies.

An example of the program is shown below:

4 times 2 is 8
4 plus 5 is 9
4 squared is 16
33 times 2 is 66
33 plus 5 is 38
33 squared is 1089

*/

public class NumbersDemo {
    public static void main (String args[]) {
        int VariableOne = 4;
        int VariableTwo = 33;

        displayTwiceTheNumber(VariableOne);
        displayTwiceTheNumber(VariableTwo);
        displayNumberPlusFive(VariableOne);
        displayNumberPlusFive(VariableTwo);
        displayNumberSquared(VariableOne);
        displayNumberSquared(VariableTwo);
    }
    public static void displayTwiceTheNumber(int n) {
        System.out.println(n + " times 2 is " + (n * 2));
    }
    public static void displayNumberPlusFive(int n) {
        System.out.println(n + " plus 5 is " + (n + 5));
    }
    public static void displayNumberSquared(int n) {
        System.out.println(n + " squared is " + (n * n));
    }
}