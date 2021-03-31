// MorgansBonuses.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-10

Morgan’s Department Store distributes bonuses to its salespeople after the holiday rush. Table 9-6 shows the bonuses, which are based on full weeks worked during the season and the number of positive online customer reviews. Write a program that allows a user to continuously enter values for the number of weeks worked and the number of positive reviews received and displays the appropriate bonus until the user enter a sentinel value: 99.
https://i.imgur.com/CTzlAlp.png

Table of positive reviews received. The table has 7 rows and 5 columns. The column headings from left to right are Full Weeks Worked, 0, 1, 2, 3, and 4 or more. The row details are as follows. Row 1: Full Weeks Worked, 0; 0, 5 period 0 0; 1, 9 period 0 0; 2, 1 6 period 0 0; 3, 2 2 period 0 0; 4 or more, 3 0 period 0 0. Row 2: Full Weeks Worked, 1; 0, 1 0 period 0 0; 1, 1 2 period 0 0; 2, 1 8 period 0 0; 3, 2 4 period 0 0; 4 or more, 3 6 period 0 0. Row 3: Full Weeks Worked, 2; 0, 2 0 period 0 0; 1, 2 5 period 0 0; 2, 3 2 period 0 0; 3, 4 2 period 0 0; 4 or more, 5 3 period 0 0. Row 4: Full Weeks Worked, 3; 0, 3 2 period 0 0; 1, 3 8 period 0 0; 2, 4 5 period 0 0; 3, 5 5 period 0 0; 4 or more, 6 8 period 0 0. Row 5: Full Weeks Worked, 4; 0, 4 6 period 0 0; 1, 5 4 period 0 0; 2, 6 5 period 0 0; 3, 7 7 period 0 0; 4 or more, 9 0 period 0 0. Row 6: Full Weeks Worked, 5; 0, 6 0 period 0 0; 1, 7 2 period 0 0; 2, 8 4 period 0 0; 3, 9 6 period 0 0; 4 or more, 1 2 0 period 0 0. Row 7: Full Weeks Worked, 6 or more; 0, 8 5 period 0 0; 1, 1 0 0 period 0 0; 2, 1 2 0 period 0 0; 3, 1 4 0 period 0 0; 4 or more, 1 7 5 period 0 0.
An example of the program is shown below:

Enter number of full weeks worked or 99 to quit >> 2
Enter number of positive reviews received >> 3
Bonus for 2 weeks and 3 positive reviews is 42.0
Enter number of full weeks worked or 99 to quit >> 99

*/

import java.util.*;
class MorgansBonuses {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        final int QUIT = 99;

        double bonuses[][] = 
            { {  5.0,   9.0,  16.0,  22.0,  30.0 }, 
              { 10.0,  12.0,  18.0,  24.0,  36.0 },
              { 20.0,  25.0,  32.0,  42.0,  53.0 }, 
              { 32.0,  38.0,  45.0,  55.0,  68.0 }, 
              { 46.0,  54.0,  65.0,  77.0,  90.0 },
              { 60.0,  72.0,  84.0,  96.0, 120.0 }, 
              { 85.0, 100.0, 120.0, 140.0, 175.0 } };

        System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
        int inputWeeks = InputService.nextInt();

        while (inputWeeks != QUIT) {
            System.out.print("Enter number of positive reviews received >> ");
            int inputReviews = InputService.nextInt();

            if (inputWeeks >= bonuses.length)
                inputWeeks = bonuses.length - 1; 

            if (inputReviews >= bonuses[0].length)
                inputReviews = bonuses[0].length - 1;

            System.out.println("Bonus for " + inputWeeks + " weeks and " + inputReviews + " positive reviews is " + bonuses[inputWeeks][inputReviews]);
            
            
            System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
            inputWeeks = InputService.nextInt();
        }
    }
}