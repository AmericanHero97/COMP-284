// AscendingAndDescending.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-2

Complete the AscendingAndDescending application so that it asks a user to enter three integers. Display them in ascending and descending order.

An example of the program is shown below:

Enter an integer... 1
And another... 2
And just one more... 3
Ascending: 1 2 3
Descending: 3 2 1

*/

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        int high, mid, low;

        System.out.print("Enter an integer... ");
        int intOne = InputService.nextInt();
        System.out.print("And another... ");
        int intTwo = InputService.nextInt();
        System.out.print("And just one more... ");
        int intThree = InputService.nextInt();

        if(intOne <= intTwo && intOne <= intThree) {
            low = intOne;

            if(intTwo <= intThree) {
                mid = intTwo;
                high = intThree;
            } else {
                mid = intThree;
                high = intTwo;
            }
        } else {
                if(intTwo <= intOne && intTwo <= intThree) {
                low = intTwo;

                if(intOne <= intThree) {
                    mid = intOne;
                    high = intThree;
                } else {
                    mid = intThree;
                    high = intOne;
                }
            } else {
                low = intThree;

                if(intOne <= intTwo) {
                    mid = intOne;
                    high = intTwo;
                } else {
                    mid = intTwo;
                    high = intOne;
                }
            }
        }

        System.out.println("Ascending: " + low + " " + mid + " " + high);
        System.out.println("Descending: " + high + " " +  mid + " " + low);
    }
}