// DebugCustomerMakingPurchase.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugCustomerMakingPurchase extends DebugCustomer {
    private double amountOfPurchase;
    private boolean overLimit;

    public DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount) {
        super(id, name, credit);
        amountOfPurchase = purchAmount;

        if (amountOfPurchase > creditLimit)
            overLimit = true;
        else
            overLimit = false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Purchase amount $" + amountOfPurchase);

        if (overLimit)
            System.out.println("****Credit denied - customer over limit");
        else
            System.out.println("Purchase Okay");
    }
}