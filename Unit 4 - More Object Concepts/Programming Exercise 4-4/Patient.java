// Patient.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3C

Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and a Rh factor (the factors are + and –). Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field.

Create a class named Patient that includes id, age, and bloodData fields. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +. Create an overloaded constructor that provides values for each field. Also provide get methods for each field.

The TestBloodData.java and TestPatient.java files have been provided to test your implementation of each class.

*/

public class Patient {
    private String id;
    private int age;
    private BloodData bloodData;

    public Patient() {
        id = "0";
        bloodData = new BloodData();
    }

    public Patient(String id, int age, String bType, String rhFactor) {
        this.id = id;
        this.age = age;
        bloodData = new BloodData(bType, rhFactor); 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData b) {
        bloodData = b;
    }
}