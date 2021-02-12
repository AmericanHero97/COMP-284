// TestLease.Java - Iakov Taranenko - 2/11/2021

/* 

Programming Exercise 3-13

Create a class named Lease with fields that hold an apartment tenant’s name (name), apartment number (aptNumber), monthly rent amount (rent), and term of the lease in months (term). Include a constructor that initializes name to “XXX”, aptNumber to 0, rent to 1000, and term to 12. Also include methods to get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee as folows: A pet fee of $10 is added to the monthly rent.

Create a class named TestLease whose main() method declares four Lease objects. Call a getData() method three times. Within the method, prompt a user for values for each field for a Lease, and return a Lease object to the main() method where it is assigned to one of main()’s Lease objects. Do not prompt the user for values for the fourth Lease object, but let it continue to hold the default values. Then, in main(), pass one of the Lease objects to the showValues() method that displays the data. Then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed. Next, call the showValues() method for the Lease object again and confirm that the pet fee has been added to the rent. Finally, call the showValues() method with each of the other three objects; confirm that two hold the values you supplied as input and one holds the constructor default values.

An example of the program is shown below:

Enter lessee name >> Jack Torrance 
Enter apartment number >> 237
Enter rent >> 100
Enter lease term in months >> 4

...

Your lease results:
Name      : Jack Torrance
Apartment : 237
Rent      : 100.0
Term      : 4

...

*/

import java.util.Scanner;

class TestLease {
   public static void main (String args[]) {
     Lease Tenant1 = new Lease();
     Tenant1:getData();
     showValues(Tenant1);

     Lease Tenant2 = new Lease();
     Tenant2:getData();
     showValues(Tenant2);

     Lease Tenant3 = new Lease();
     Tenant3:getData();
     showValues(Tenant3);
     Tenant3.addPetFee();
     showValues(Tenant3);

     Lease Tenant4 = new Lease();
     showValues(Tenant4);
   }

   public static void showValues(Lease Tenant) {
      System.out.println("\n\nYour lease results:" +
         "\nName      : " + Tenant.getName() +
         "\nApartment : " + Tenant.getAptNumber() +
         "\nRent      : " + Tenant.getRent() +
         "\nTerm      : " + Tenant.getTerm());
   }

   public static Lease getData() {
     Scanner inputService = new Scanner(System.in);
     Lease Tenant = new Lease();

     System.out.print("\nEnter lease name >> ");
     Tenant.setName(inputService.nextLine());

     System.out.print("Enter apartment number >> ");
     Tenant.setAptNumber(inputService.nextInt());

     System.out.print("Enter rent >> ");
     Tenant.setRent(inputService.nextDouble());

     System.out.print("Enter lease term in months >> ");
     Tenant.setTerm(inputService.nextInt());

     return Tenant;
   }
}