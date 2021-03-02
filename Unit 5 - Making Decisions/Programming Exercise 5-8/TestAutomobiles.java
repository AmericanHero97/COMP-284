// TestAutomobiles.Java - Iakov Taranenko - 3/1/2021

/* 

Programming Exercise 5-8

Modify a dealership's Automobile class so it includes fields for an id (ID number), make, model, color, year, and mpg (miles per gallon). Include get and set methods for each field.

Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0.
Do not allow the year to be earlier than 2005 or later than 2019; if it is, set the year to 0.
Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0.
Include a constructor that accepts arguments for each field value and uses the set methods to assign the values.

The TestAutomobile.java file has been provided to test your implementation.

*/

public class TestAutomobiles {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile(1451, "Chevrolet", "Camaro", "red", 2010, 24.5);
        Automobile auto2 = new Automobile(145188, "Ford", "Focus", "white", 2020, 75);

        display(auto1, "good declaration");
        display(auto2, "bad declaration");

        auto1.setId(-3);
        display(auto1, "bad ID");
        auto1.setId(2222);
        display(auto1, "good ID");
        auto1.setMake("Toyota");
        auto1.setModel("Corolla");
        display(auto1, "change make and model");

        auto2.setId(8686);
        auto2.setColor("blue");
        auto2.setYear(2016);
        display(auto2, "change ID, color, and year");

        auto2.setMpg(4);
        display(auto2, "bad mpg");
        auto2.setMpg(30);
        display(auto2, "good mpg");
    }

    public static void display(Automobile auto, String msg) {
        System.out.println(msg + "    " + auto.getId() + " " + auto.getMake() + " " + auto.getModel() +  " " + auto.getColor() + " " + auto.getYear() + " " + auto.getMpg() + " miles per gallon");
    }
}