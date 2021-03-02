// Apartment.Java - Iakov Taranenko - 3/1/2021

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

public class Apartment {
    int aptNumber;
    int bedrooms;
    double baths;
    double rent;

    public Apartment(int num, int bdrms, double bths, double rent) {
        aptNumber = num;
        bedrooms = bdrms;
        baths = bths;
        this.rent = rent;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public double getBaths() {
        return baths;
    }

    public double getRent() {
        return rent;
    }
}