// AcmePay.Java - Iakov Taranenko - 3/2/2021

/* 

Programming Exercise 5-6

Acme Parts runs a small factory and employs workers who are paid one of three hourly rates depending on their shift:

first shift, $17 per hour
second shift, $18.50 per hour
third shift, $22 per hour
Each factory worker might work any number of hours per week; any hours greater than HOURS_MIN are paid at one and one-half times the usual rate. In addition, second and third shift workers can elect to participate in the retirement plan for which 3% of the worker’s gross pay is deducted from the paychecks.

Write the AcmePay program that prompts the user for hours worked, shift, and, if the shift is 2 or 3, whether the worker elects the retirement (1 for yes, 2 for no). Display:

Hours worked
Shift
Hourly pay rate
Regular pay
Overtime pay
Total of regular and overtime pay
Retirement deduction, if any
Net pay.
An example of the program is shown below:

Please enter shift - 1, 2, or 3
2
Please enter hours worked
9
Do you want to participate in the retirement plan?
   Enter 1 for Yes and 2 for No.
1

Hours worked is    9.0
Hourly pay rate is 18.5
Regular pay is     166.5
Overtime pay is    0.0
Retirement deduction is 4.995
Net pay is....................161.505

*/

import java.util.*;

public class AcmePay {
    public static void main(String[] args) throws Exception {
        Scanner InputService = new Scanner(System.in);

        final double FIRST_SHIFT_PAY = 17.00;
        final double SECOND_SHIFT_PAY = 18.50;
        final double THIRD_SHIFT_PAY = 22.00;
        final double RETIREMENT_SAVING = 0.03;
        final double UNDER_HOUR_MIN = 1.5;
        final int HOURS_MIN = 40;


        int retirementParticipation = 0;
        double hourlyPay = 0;
        double overtimePay = 0;
        double regularPay = 0;
        double totalPay = 0;
        double retirementDeduction = 0;

        System.out.println("Please enter shift - 1, 2, or 3");
        int shiftType = InputService.nextInt();
        System.out.println("Please enter hours worked");
        int hoursWorked = InputService.nextInt();

        if (shiftType != 1) {
            System.out.println("Do you want to participate in the retirement plan?" 
                                + "\n    Enter 1 for Yes and 2 for No.");
            retirementParticipation = InputService.nextInt();
        }

        if (shiftType == 1) {
            hourlyPay = FIRST_SHIFT_PAY;

            if (hoursWorked <= HOURS_MIN) {
                regularPay = hourlyPay * hoursWorked;
            } else if (hoursWorked > HOURS_MIN) {
                regularPay = hourlyPay * HOURS_MIN;
                overtimePay = (hoursWorked - HOURS_MIN) * hourlyPay * UNDER_HOUR_MIN;
            }

            totalPay = regularPay + overtimePay;
        } else if (shiftType == 2) {
            hourlyPay = SECOND_SHIFT_PAY;

            if (hoursWorked <= HOURS_MIN) {
                regularPay = hourlyPay * hoursWorked;
            } else if (hoursWorked > HOURS_MIN) {
                regularPay = hourlyPay * HOURS_MIN;
                overtimePay = (hoursWorked - HOURS_MIN) * hourlyPay * UNDER_HOUR_MIN;
            }

            totalPay = regularPay + overtimePay;

            if (retirementParticipation == 1) {
                retirementDeduction = totalPay * RETIREMENT_SAVING;
            }

            totalPay = totalPay - retirementDeduction;
        } else {
            hourlyPay = THIRD_SHIFT_PAY;

            if (hoursWorked <= HOURS_MIN) {
                regularPay = hourlyPay * hoursWorked;
            } else if (hoursWorked > HOURS_MIN) {
                regularPay = hourlyPay * HOURS_MIN;
                overtimePay = (hoursWorked - HOURS_MIN) * hourlyPay * UNDER_HOUR_MIN;
            }

            totalPay = regularPay + overtimePay;

            if (retirementParticipation == 1) {
                retirementDeduction = totalPay * RETIREMENT_SAVING;
            }

            totalPay = totalPay - retirementDeduction;
        }

        System.out.println("\n"
                            + "\nHours worked is    " + hoursWorked
                            + "\nHourly pay rate is " + hourlyPay
                            + "\nRegular pay is     " + regularPay
                            + "\nOvertime pay is    " + overtimePay
                            + "\nRetirement deduction is " + retirementDeduction
                            + "\nNet pay is...................." + totalPay);
    }
}