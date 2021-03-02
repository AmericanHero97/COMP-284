// CellPhoneService.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-4

Write the CellPhoneService program for Horizon Phones, a provider of cellular phone service. Prompt a user for maximum monthly values for talk minutes used, text messages sent, and gigabytes of data used, and then recommend the best plan for the customer’s needs.

A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month.

A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month.

A customer who needs 500 or more minutes of talk and no data should accept either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text messages or more at $70 per month.

A customer who needs any data should accept Plan E for up to 3 gigabytes at $79 or Plan F for 3 gigabytes or more at $87.

An example of the program is shown below:

Enter talk minutes needed
400
Enter text messages needed
1000
Enter gigabytes of data needed
5
Plan F  $87 per month

*/

import java.util.*;

public class CellPhoneService {
    public static void main (String args[]) {
        Scanner InputService = new Scanner(System.in);

        final int PLAN_A = 49;
        final int PLAN_B = 55;
        final int PLAN_C = 61;
        final int PLAN_D = 70;
        final int PLAN_E = 79;
        final int PLAN_F = 87;
        
        final int TALK_MIN = 500;
        final int TEXT_MIN = 100;
        final int DATA_MIN = 3;

        char plan;
        int totalPrice;

        System.out.println("Enter talk minutes needed");
        int talk = InputService.nextInt();
        System.out.println("Enter text messages needed");
        int text = InputService.nextInt();
        System.out.println("Enter gigabytes of data needed");
        int data = InputService.nextInt();

        if (data > 0) {
            if (data >= DATA_MIN) {
                plan = 'F';
                totalPrice = PLAN_F;
            } else {
                plan = 'E';
                totalPrice = PLAN_E;
            }
        } else {
            if (talk < TALK_MIN) {
                if (text == 0) {
                    plan = 'A';
                    totalPrice = PLAN_A;
                } else {
                    plan = 'B';
                    totalPrice = PLAN_B;
                }
            } else {
                if (text >= TEXT_MIN) {
                    plan = 'D';
                    totalPrice = PLAN_D;
                } else {
                    plan = 'C';
                    totalPrice = PLAN_C;
                }
            }
        }
        System.out.println("Plan " + plan + "  $" + totalPrice + " per month");
    }
}