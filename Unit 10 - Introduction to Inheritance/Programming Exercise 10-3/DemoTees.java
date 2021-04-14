// DemoTees.Java - Iakov Taranenko - 4/13/2021

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

import java.util.*;
public class DemoTees {
    public static void main(String[] args) {
        TeeShirt tee1 = new TeeShirt();
        TeeShirt tee2 = new TeeShirt();
        CustomTee tee3 = new CustomTee();;
        CustomTee tee4 = new CustomTee();

        tee1.setOrderNumber(100);
        tee1.setSize("XXL");
        tee1.setColor("blue");
        tee2.setOrderNumber(101);
        tee2.setSize("S");
        tee2.setColor("gray");
        tee3.setOrderNumber(102);
        tee3.setSize("L");
        tee3.setColor("red");
        tee3.setSlogan("Born to have fun");
        tee4.setOrderNumber(104);
        tee4.setSize("XXXL");
        tee4.setColor("black");
        tee4.setSlogan("Wilson for Mayor");

        display(tee1);
        display(tee2);
        displayCustomData(tee3);
        displayCustomData(tee4);
    }
    
    public static void display(TeeShirt tee) {
        System.out.println("Order #" + tee.getOrderNumber());
        System.out.println("     Description: " + tee.getSize() +  " " + tee.getColor());
        System.out.println("     Price: $" + tee.getPrice());
    }

    public static void displayCustomData(CustomTee tee) {
        display(tee);
        System.out.println("     Slogan: " + tee.getSlogan());
    }
}