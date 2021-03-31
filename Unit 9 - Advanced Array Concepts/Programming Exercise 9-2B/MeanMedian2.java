// MeanMedian2.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-2B

Revise the MeanMedian2 class from Chapter 9 Exercise 2A so that the user can enter any number of values up to 20. If the list has an even number of values, the median is the numeric average of the values in the two middle positions. Allow the user to enter 9999 to quit entering numbers.

An example of the program is shown below:

...
Enter number 8 or 9999 to quit
10
Enter number 9 or 9999 to quit
700
Enter number 10 or 9999 to quit
9999

size is 9
You entered: 25,  50,  500,  550,  450,  600,  200,  10,  700
The mean is 342.77777777777777 and the median is 450.0

The example above is abbreviated and included for guidance and does not include all the information generated by the program.

*/

import java.util.*;
class MeanMedian2 {
    public static void main(String[] args) {
        // int[] nums;
        int num = 0;
        String entry;
        String list = "You entered: ";
        int a, b;
        int temp;
        double median;
        int total = 0;
        double mean = 0;
        final int QUIT = 9999;
        int size = 0;

        for(a = 0; num != QUIT && a < nums.length; ++a)  {
            // your code here
        }

        System.out.println("size is " + a);

        if(num != QUIT)
            size = nums.length;
        else
            size = a - 1;
        
        System.out.println("size is " + size);
        System.out.println(list);
        int comparisonsToMake = size - 1;

        for(a = 0; a < size - 1; ++a) {
            for(b = 0; b < comparisonsToMake; ++b) {
                if(nums[b] > nums[b + 1]) {
                    temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
            }
        --comparisonsToMake;
        }

        // your code here

        System.out.println("The mean is " + mean + " and the median is " + median);
    }
}