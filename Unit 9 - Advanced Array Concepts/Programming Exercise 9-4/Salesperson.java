// Salesperson.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-4

In Chapter 8, Programming Exercise 6 you created a Salesperson class with fields for an ID number and sales values. Now, create an application that allows a user to enter values for an array of seven Salesperson objects. Offer the user the choice of displaying the objects in ascending order by either (I)D number or (S)ales value.

An example of the program is shown below:

Enter an ID number
100
Enter sales value
250
Enter an ID number
101
Enter sales value
500.25
Enter an ID number
103
Enter sales value
600.50
Enter an ID number
106
Enter sales value
78
Enter an ID number
105
Enter sales value
80.2
Enter an ID number
102
Enter sales value
45.68
Enter an ID number
104
Enter sales value
120
By which field do you want to sort?
(I)d number or (S)ales
I

ID 100  sales: 250.0
ID 101  sales: 500.25
ID 102  sales: 45.68
ID 103  sales: 600.5
ID 104  sales: 120.0
ID 105  sales: 80.2
ID 106  sales: 78.0

*/

public class Salesperson {
    private int id;
    private double sales;

    Salesperson(int idNum, double amt) {
        id = idNum;
        sales = amt;
    }
    
    public int getId() {
        return id;
    }

    public double getSales() {
        return sales;
    }

    public void setId(int idNum) {
        id = idNum;
    }

    public void setSales(double amt) {
        sales = amt;
    }
}