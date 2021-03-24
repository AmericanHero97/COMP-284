// DrugTests2.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-12A

In Chapter 6 Exercise 11, you created an application named DrugTests that produces a list of randomly selected employees who will be tested each week for the next 52 weeks. Now modify the program to include a count and display of the number of times each employee is selected. Also display a list of employee numbers that never were selected for testing.

An example of the program is shown below:

week 1 Emp # 6      week 2 Emp # 18      week 3 Emp # 8      week 4 Emp # 21      
week 5 Emp # 19     week 6 Emp # 10      week 7 Emp # 9      week 8 Emp # 14      
week 9 Emp # 21     week 10 Emp # 2      week 11 Emp # 13    week 12 Emp # 26  
...
Employee #1 is tested 1 time(s).  Employee #2 is tested 2 time(s).  Employee #3 is tested 1 time(s).  
Employee #4 is tested 1 time(s).  Employee #5 is tested 2 time(s).  Employee #6 is tested 3 time(s).  
Employee #7 is tested 2 time(s).  Employee #8 is tested 1 time(s).  Employee #9 is tested 3 time(s).
...
List of employees never tested during the year:
Emp #25   Emp #27  

*/

public class DrugTests2 {
    public static void main(String[] args) {
        int testedEmployee;
        int week;
        final int WEEKS = 52;
        final int EMPLOYEES = 30;

        for (week = 1; week <= WEEKS; ++week) {
            testedEmployee = 1 + (int) (Math.random() * EMPLOYEES);
            System.out.print("week " + week + " Emp # " +  testedEmployee + "      ");

            if (week % 4 == 0)
                System.out.println();
        }
    }
}