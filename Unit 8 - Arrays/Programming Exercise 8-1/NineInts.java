// NineInts.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-1

Write an application that stores the following nine integers in an array: 10, 15, 19, 23, 26, 29, 31, 34, 38. Display the integers from first to last, and then display the integers from last to first.

*/

public class NineInts {
    public static void main (String args[]) {
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.print(numbers[i] + "  ");
        System.out.println();
    }
}