// TestBloodData.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3C

Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and a Rh factor (the factors are + and –). Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field.

Create a class named Patient that includes id, age, and bloodData fields. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +. Create an overloaded constructor that provides values for each field. Also provide get methods for each field.

The TestBloodData.java and TestPatient.java files have been provided to test your implementation of each class.

*/

public class TestBloodData {
    public static void main(String[] args) {
        BloodData b1 = new BloodData();
        BloodData b2 = new BloodData("A", "-");

        display(b1);
        display(b2);

        b1.setBloodType("AB");
        b1.setRhFactor("-");

        display(b1);
    }

    public static void display(BloodData b) {
        System.out.println("The blood is type " +  b.getBloodType() + b.getRhFactor());
    }
}