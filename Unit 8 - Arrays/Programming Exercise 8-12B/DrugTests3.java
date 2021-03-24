// DrugTests2.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-12B

When a series of random numbers is generated, it is quite common for the same number to be selected consecutively multiple times. Although duplicates happen in randomized lists, humans tend to see such repetition as “unfair.” Modify the DrugTests3 class so that if an employee number is selected immediately after it was already selected, a new number is selected for the week. Also display a message explaining that a new number is being selected.

An example of the program is shown below:

week 1 Emp # 9      week 2 Emp # 24      week 3 Emp # 25      week 4 Emp # 21      
week 5 Emp # 29     week 6 Emp # 21      week 7 Emp # 27      week 8 Emp # 7      
week 9 Emp # 13     Employee #13 was selected two weeks in a row -- making new selection    week 10 Emp # 26     week 11 Emp # 19     week 12 Emp # 1  
...
Employee #1 is tested 2 time(s).  Employee #2 is tested 3 time(s).  Employee #3 is tested 0 time(s).  
Employee #4 is tested 1 time(s).  Employee #5 is tested 1 time(s).  Employee #6 is tested 1 time(s).  
Employee #7 is tested 5 time(s).  Employee #8 is tested 3 time(s).  Employee #9 is tested 3 time(s).  
...
List of employees never tested during the year:
Emp #3   Emp #11

*/

public class DrugTests3 {
    public static void main(String[] args) {
        int testedEmployee;
        int week;
        final int WEEKS = 52;
        final int EMPLOYEES = 30;
        int[] counts = new int[EMPLOYEES];
        int countNeverTested = 0;
        int x;

        for (week = 1; week <= WEEKS; ++week) {
            testedEmployee = 1 + (int) (Math.random() * EMPLOYEES);
            System.out.print("week " + week + " Emp # " + testedEmployee + "      ");

            if (week % 4 == 0)
                System.out.println();

            counts[testedEmployee - 1]++;
        }

        for (x = 0; x < EMPLOYEES; x++) {
            System.out.print("Employee #" + (x + 1) + " is tested " + counts[x] + " time(s).  ");

            if ((x + 1) % 3 == 0)
                System.out.println();
        }

        System.out.println("List of employees never tested during the year:");
        for (x = 0; x < EMPLOYEES; x++) {
            if (counts[x] == 0) {
                countNeverTested++;
                System.out.print("Emp #" + (x + 1) + "   ");
            }
        }

        if (countNeverTested == 0)
            System.out.println("All employees were tested at least once");
    }
}