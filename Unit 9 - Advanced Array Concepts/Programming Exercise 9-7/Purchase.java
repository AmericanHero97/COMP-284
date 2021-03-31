// Purchase.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-7

In the exercises in Chapter 6, you created a class named Purchase. Each Purchase contains an invoice number (invoiceNumber), amount of sale (saleAmount), amount of sales tax (tax). Add get and set methods for the invoice number and sale amount fields so their values can be used in comparisons. Include a display method to display the invoice number, sale amount, and tax information.

Next, implement the SortPurchaseArray program that declares an array of five Purchase objects and prompt a user for their values. Then, in a loop that continues until a user inputs a sentinel value of Z, ask the user whether the Purchase objects should be sorted and displayed in invoice number order or sale amount order by entering the values of I and S respectively.

An example of the program is shown below:

Enter invoice number >> 104
Enter sale amount >> 456
Enter invoice number >> 102
Enter sale amount >> 400
Enter invoice number >> 103
Enter sale amount >> 24.50
Enter invoice number >> 101
Enter sale amount >> 275
Enter invoice number >> 100
Enter sale amount >> 300

Sort Purchases by (I)nvoice number, or (S)ale amount? S

Sorted by sale amount

Invoice #103  Amount of sale: $24.5  Tax: $1.225
Invoice #101  Amount of sale: $275.0  Tax: $13.75
Invoice #100  Amount of sale: $300.0  Tax: $15.0
Invoice #102  Amount of sale: $400.0  Tax: $20.0
Invoice #104  Amount of sale: $456.0  Tax: $22.8

Sort Purchases by (I)nvoice number, or (S)ale amount?
      or enter Z to quit >> Z

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