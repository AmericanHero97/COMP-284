// DebugTen4.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// A customer's purchase is approved if the
// purchase does not exceed the credit limit
public class DebugTen4 {
    public static void main(String args[]) {
        int id = 12241;
        String name = "Franklin";
        double credit = 1000.00;
        double purchase = 1325.77;

        DebugCustomerMakingPurchase cust = new DebugCustomerMakingPurchase(id, name, credit, purchase);
        cust.display();
    }
}