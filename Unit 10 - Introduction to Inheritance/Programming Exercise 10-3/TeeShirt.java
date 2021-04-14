// TeeShirt.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-3

Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include:

orderNumber - of type int
size - of type String
color - of type String
price - of type double
Create set methods for the order number, size, and color and get methods for all four fields. The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes.

Create a subclass named CustomTee that descends from TeeShirt and includes a field named slogan (of type String) to hold the slogan requested for the shirt, and include get and set methods for this field.

An example of the DemoTees program is shown below:

Order #100
     Description: XXL blue
     Price: $22.99
Order #101
     Description: S gray
     Price: $19.99
Order #102
     Description: L red
     Price: $19.99
     Slogan: Born to have fun
Order #104
     Description: XXXL black
     Price: $22.99
     Slogan: Wilson for Mayor

*/

public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    public void setOrderNumber(int num) {
        // write your code here
    }

    public void setSize(String sz) {
        // write your code here
    }

    public void setColor(String color) {
        // write your code here
    }

    public int getOrderNumber() {
        // write your code here
    }

    public String getSize() {
        // write your code here
    }

    public String getColor() {
        // write your code here
    }

    public double getPrice() {
        // write your code here
    }
}