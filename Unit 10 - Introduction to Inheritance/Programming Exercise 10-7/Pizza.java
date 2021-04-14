// Pizza.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-7

Create a class named Pizza with the following data fields:

description - of type String
price - of type double
The description stores the type of pizza (such as sausage and onion). Include a constructor that requires arguments for both fields and a method named display() to display the data. For example, if the description is 'sausage and onion' and the price is '14.99', the display() method should output:

sausage and onion pizza Price: $14.99
Create a subclass named DeliveryPizza that inherits from Pizza but adds the following data fields:

deliveryFee - of type double
address - of type String
The description, price, and address are required as arguments to the constructor. The delivery fee is $3 if the pizza ordered costs more than $15; otherwise it is $5.

Add a display() method to the DeliveryPizza class. The display() method should print the information from the display() method in the super class (Pizza) in addition to the address and delivery fee.

sausage and onion pizza Price: $14.99
    Deliver to: 22 Acorn Street, APT 882. Fee is 5.0
    
*/

public class Pizza {
   // Define the Pizza class here
}