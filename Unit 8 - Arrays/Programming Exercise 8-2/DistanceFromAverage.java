// DistanceFromAverage.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-2

Allow a user to enter any number of double values up to 15. The user should enter 99999 to quit entering numbers. Display an error message if the user quits without entering any numbers; otherwise, display each entered value and its distance from the average.

An example of the program is shown below:

Enter a numeric value or 99999 to quit >> 22.86
Enter next numeric value or 99999 to quit >> 101.20
Enter next numeric value or 99999 to quit >> 77.0
Enter next numeric value or 99999 to quit >> 82.25
Enter next numeric value or 99999 to quit >> 99999
You entered 4 numbers and their average is 70.8275
22.86 is -47.9675 away from the average
101.2 is 30.372500000000002 away from the average
77.0 is 6.172499999999999 away from the average
82.25 is 11.4225 away from the average

*/

import java.util.*;
public class DistanceFromAverage {
    public static void main (String[] args) {
        Scanner InputService = new Scanner(System.in);
        final int MAX = 99999;
        double[] numbers = new double[20];
        double input, average = 0, total = 0;
        int x = 0, y;

        System.out.print("Enter a numeric value or " + MAX + " to quit >> ");
        input = InputService.nextDouble();

        while (input != MAX && x < numbers.length) {
            numbers[x] = input;
            total += numbers[x];
            x++;

            if(x < numbers.length) {
                System.out.print("Enter next numeric value or " + MAX + " to quit >> ");
                input = InputService.nextDouble();  
            }

        }

        if (x == 0) {
            System.out.println("Average cannot be computed because no numbers were entered");
        } else {
            average = total / x;
            System.out.println("You entered " + x + " numbers and their average is " + average);

            for (y = 0; y < x; y++) {
                System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
            }           
        }
    }
}