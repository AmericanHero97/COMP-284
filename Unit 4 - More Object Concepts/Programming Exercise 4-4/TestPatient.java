// TestPatient.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3C

Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and a Rh factor (the factors are + and –). Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field.

Create a class named Patient that includes id, age, and bloodData fields. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +. Create an overloaded constructor that provides values for each field. Also provide get methods for each field.

The TestBloodData.java and TestPatient.java files have been provided to test your implementation of each class.

*/

public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("1234", 35, "B", "+");
        BloodData b2 = new BloodData("A", "-");

        display(p1);
        display(p2);

        p1.setId("3456");
        p1.setAge(42);

        BloodData b = new BloodData("AB", "-");

        p1.setBloodData(b);
        display(p1);
    }

    public static void display(Patient p) {
        BloodData bt = p.getBloodData();
        System.out.println("Patient #" + p.getId() + "  age: " + + p.getAge() + "\n   The blood is type " + bt.getBloodType() + bt.getRhFactor());
    }
}