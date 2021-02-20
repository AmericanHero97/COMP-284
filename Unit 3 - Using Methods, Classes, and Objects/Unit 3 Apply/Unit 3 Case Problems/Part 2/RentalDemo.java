// RentalDemo.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

c. Use the SammysRentalPriceWithMethods class you created in Step 2a as a starting point for a program that demonstrates the Rental class you created in Step 2b, but make the following changes:

-You already have a method that gets a number of minutes from a user; now add a method that gets a contract number. The main() method should declare a Rental object, call the two data entry methods, and use their returned values to set the fields in the Rental object.
-From the SammysRentalPriceWithMethods class, call the RentalDemo method that displays the company motto with the border. The method is accessible because it is public, but you must fully qualify the name because it is in another class.
-Revise the method that displays the rental details so that it accepts the newly created Rental object. The method should display the contract number, and it still should display the hours and minutes, the hourly rate, and the total price.

Save the program as RentalDemo.java.

*/
import java.util.Scanner;

class RentalDemo {
    public static void main(String[] args) {
        String contractNumber;
        int minutes;

        Rental Rental = new Rental();
        contractNumber = getContractNumber();
        minutes = getMinutes();

        Rental.setContractNumber(contractNumber);
        Rental.setTime(minutes);

        displayDetails(Rental);
    }

    public static String getContractNumber() {
        Scanner InputService = new Scanner(System.in);

        String contractNumber;
        System.out.print("Enter contract number >> ");
        contractNumber = InputService.nextLine();

        return contractNumber;
    }

    public static int getMinutes() {
        Scanner InputService = new Scanner(System.in);

        int minutes;
        System.out.print("Enter minutes >> ");
        minutes = InputService.nextInt();

        return minutes;
    }

    public static void displayDetails(Rental Rental) {
        System.out.println("Your order details: "
            + "\n Contract Number: " + Rental.getContractNumber()
            + "\n Hours: " + Rental.getHours()
            + "\n Minutes: " + Rental.getExtraMinutes()
            + "\n Hourly Rate of: $" + Rental.PRICE_PER_HOUR
            + "\n Total Price: $" + Rental.getTotalprice());
    }

    public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy’s makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }
}