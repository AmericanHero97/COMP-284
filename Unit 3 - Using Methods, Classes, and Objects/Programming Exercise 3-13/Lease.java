// Lease.Java - Iakov Taranenko - 2/10/2021

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

class Lease {
    private String name;
    private int aptNumber;
    private double rent;
    private int term;
    private static final int FEE = 10;

    public Lease() {
    }

    public void setName(String tenant) {
    }

    public void setAptNumber(int apt) {
    }

    public void setRent(double monthRent) {
    }

    public void setTerm(int t) {
    }

    public String getName() {
    }

    public int getAptNumber() {
    }

    public double getRent() {
    }

    public int getTerm() {
    }

    public void addPetFee() {
    }

    public static void explainPetPolicy() {
    }
}