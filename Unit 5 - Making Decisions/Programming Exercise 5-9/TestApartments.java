// TestApartments.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-9

Modify the Apartment class so that it holds an aptnumber (apartment number), bedrooms (number of bedrooms), baths (number of baths), and rent (rent amount). Create a constructor that accepts values for each data field. Also create a get method for each field.

Modify the TestApartment application so that it creates at least five Apartment objects. Then prompt a user to enter a minimum number of bedrooms required, a minimum number of baths required, and a maximum rent the user is willing to pay. Display data for all the Apartment objects that meet the user’s criteria or No apartments met your criteria if no such apartments are available.

An example of the program is shown below:

Enter minimum number of bedrooms needed >> 1
Enter minimum number of bathrooms needed >> 1
Enter maximum rent willing to pay >> 1000

Apartments meeting citeria of
at least 1 bedrooms, at least 1 baths, and  no more than $1000.0 rent:
   Apt #101    2 bedrooms, and 1.0 baths. Rent $725.0
   Apt #102    2 bedrooms, and 1.5 baths. Rent $775.0
   Apt #103    3 bedrooms, and 2.0 baths. Rent $870.0
   Apt #104    3 bedrooms, and 2.5 baths. Rent $960.0

*/

import java.util.*;

public class TestApartments {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);

        int bdrms;
        int baths;
        double rent;
        int count = 0;

        System.out.print("Enter minimum number of bedrooms needed >> ");
        bdrms = input.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        baths = input.nextInt();
        System.out.print("Enter maximum rent willing to pay >> ");
        rent = input.nextDouble();
        System.out.println("\nApartments meeting citeria of\nat least " + bdrms + " bedrooms, at least " + baths + " baths, and " + " no more than $" + rent + " rent:");

        if(checkApt(apt1, bdrms, baths, rent)) {
            display(apt1);
            count = count++;
        }

        if(checkApt(apt2, bdrms, baths, rent)) {
            display(apt2);
            count = count++;
        }

        if(checkApt(apt3, bdrms, baths, rent)) {
            display(apt3);
            count = count++;
        }

        if(checkApt(apt4, bdrms, baths, rent)) {
            display(apt4);
            count = count++;
        }

        if(checkApt(apt5, bdrms, baths, rent)) {
            display(apt5);
            count = count++;
        }

        if(count == 0)
            System.out.println("No apartments met your criteria");
    }

    public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) {
        if(apt.getBedrooms() >= bdrms && apt.getBaths() >= baths && apt.getRent() <= rent)
            return true;
        return false;
    }

    public static void display(Apartment apt) {
        System.out.println("   Apt #" + apt.getAptNumber() + "    " + apt.getBedrooms() +  " bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent());
    }
}