// DebugCustomer.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugCustomer {
    protected int idNumber;
    protected String name;
    protected double creditLimit;

    public DebugCustomer(int id, String name, double credit) {
        idNumber = id;
        this.name = name;
        creditLimit = credit;
    }

    public void display() {
        System.out.println("Customer #" + idNumber + " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}