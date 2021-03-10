// Purchase.Java - Iakov Taranenko - 3/9/2021

/* 

Programming Exercise 6-15

Create a class named Purchase. Each Purchase contains an invoice number, amount of sale, and amount of sales tax. Include set methods for the invoice number and sale amount. Within the set() method for the sale amount, calculate the sales tax as 5% of the sale amount. Also include a display method that displays a purchase’s details.

*/

public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double tax;
    private static final double RATE = 0.05;

    public void setInvoiceNumber(int num) {
        invoiceNumber = num;
    }

    public void setSaleAmount(double amt) {
        saleAmount = amt;
        tax = saleAmount * RATE;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void display() {
        System.out.println("Invoice #" + invoiceNumber + "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
    }
}