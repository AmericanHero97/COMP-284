// Majors.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-9

Create a class named Majors that includes an enumeration for the six majors offered by a college as follows: 
ACC, CHEM, CIS, ENG, HIS, PHYS. Display the enumeration values for the user, and then prompt the user to enter a major. 
Display the college division in which the major falls. ACC and CIS are in the Business Division, CHEM and PHYS are in the Science Division, and ENG and HIS are in the Humanities Division.

*/

import java.util.Scanner;
public class Majors {
    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};

    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        
        System.out.println("The majors we offer are:");
        for(Major i : Major.values())
            System.out.print(i + " ");

        System.out.print("\n\nEnter your major >> ");
        String input = InputService.nextLine().toUpperCase();
        System.out.println("You entered " + input);

        if (input.equals("ACC") || input.equals("CIS")) {
            System.out.println("Business Division");
        } else if (input.equals("CHEM") || input.equals("PHYS")) {
            System.out.println("Science Division");
        } else {
            System.out.println("Humanities Division");
        }
    }
}