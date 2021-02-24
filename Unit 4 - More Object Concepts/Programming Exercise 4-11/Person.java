// Person.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-11

Modify the class named Person that holds the following fields: two String objects for the person’s first and last name and a LocalDate object for the person’s birthdate.

Modify the class named Couple that contains two Person objects.

Modify the class named Wedding for a wedding planner that includes the date of the wedding, the Couple being married, and a String for the location.

Provide constructors for each class that accept parameters for each field, and provide get methods for each field. The TestWedding.java program has been provided for you to test the implementations of the Person, Couple, and Wedding classes.

The TestWedding.java file has been provided to test your implementation.

An example of the program is shown below:

Hanson/Ziller Wedding
Date: 2016-06-18   Location: Mayfair Country Club
Bride: Kimberly Hanson 1986-12-14
Groom: Mark Ziller 1984-03-08

Howard/Nemo Wedding
Date: 2016-06-25   Location: Oceanview Park
Bride: Janna Howard 1991-04-17
Groom: Julius Nemo 1992-02-14

*/

import java.time.*;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String first, String last, LocalDate date) {
        firstName = first;
        lastName = last;
        birthDate = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}