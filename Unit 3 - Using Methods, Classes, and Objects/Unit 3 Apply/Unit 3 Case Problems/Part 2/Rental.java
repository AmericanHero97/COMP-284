// Rental.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

b. Create a class to hold Rental data for Sammy's Seashore Supplies. The class contains:

-Two public final static fields that hold the number of minutes in an hour and the hourly rental rate ($40)
-Four private fields that hold a contract number, number of hours for the rental, number of minutes over an hour, and the price. The contract number is stored as a String because Sammy plans to assign contract numbers such as K681.
-Two public set methods. One sets the contract number (setContractNumber()). The other is named setHoursAndMinutes(), and it accepts the number of minutes for the rental and then sets the hours, extra minutes over an hour, and the total price. Recall from Chapter 2 that the price is $40 per hour plus $1 for every extra minute.
-Four public get methods that return the values in the four nonstatic fields.

Save the file as Rental.java.

*/

class Rental {
    public final int MINS_PER_HOUR = 60;
    public final double PRICE_PER_HOUR = 40;

    private String contractNumber;
    private int hours;
    private int extraMinutes;
    private double totalPrice;

    public void setContractNumber(String newContractNumber) {
        contractNumber = newContractNumber;
    }

    public void setTime(int givenMinutes) {
        hours = givenMinutes / MINS_PER_HOUR;
        extraMinutes = givenMinutes % MINS_PER_HOUR;

        totalPrice = hours * PRICE_PER_HOUR + extraMinutes;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getExtraMinutes() {
        return extraMinutes;
    }

    public double getTotalprice() {
        return totalPrice;
    }
}