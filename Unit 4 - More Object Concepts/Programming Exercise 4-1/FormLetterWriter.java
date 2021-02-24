// FormLetterWriter.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-1

Modify the class named FormLetterWriter that includes two overloaded methods named displaySalutation(). The first method takes one String parameter that represents a customer’s last name, and it displays the salutation Dear Mr. or Ms. followed by the last name. The second method accepts two String parameters that represent a first and last name, and it displays the greeting Dear followed by the first name, a space, and the last name. After each salutation, display the rest of a short business letter using the displayLetter method: Thank you for your recent order.

An example of the program is shown below:

Dear Mr. or Ms. Kelly,
   Thank you for your recent order.

Dear Christy Johnson,
   Thank you for your recent order.

*/

public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Kelly");
        displayLetter();
        
        displaySalutation("Christy", "Johnson");
        displayLetter();
    }

    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    public static void displayLetter() {
         System.out.println("  Thank you for your recent order.");
    }
}