// Sandwich.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-11

Implement the class named Sandwich that contains the following data fields:
 - MainIngredient - of type String
 - Bread - of type String
 - Price - of type Double

Include get and set methods for these fields. The methods should be prefixed with 'get' or 'set' respectively, followed by the field name using camel case. For example, setMainIngredient.

Use the application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the set and get methods to test your class.

An example of the program is shown below:

You have ordered a tuna sandwich on wheat bread, and the price is 4.

*/

public class Sandwich {
    String MainIngredient;
    String Bread;
    double Price;

    public void setMainIngredient(String MainIngredientInput) {
        MainIngredient = MainIngredientInput;
    }

    public String getMainIngredient() {
        return(MainIngredient);
    }

    public void setBread(String BreadInput) {
        Bread = BreadInput;
    }

    public String getBread() {
        return(Bread);
    }

    public void setPrice(double PriceInput) {
        Price = PriceInput;
    }

    public double getPrice() {
        return(Price);
    }
}