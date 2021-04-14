// DemoCandles.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-2

Mick’s Wicks makes candles in various sizes. Create a class for the business named Candle that contains the following data fields:

color - of type String
height - of type int
price - of type double
Create get methods for all three fields. Create set methods for color and height, but not for price. Instead, when height is set, determine the price as $2 per inch.

Create a child class named ScentedCandle that contains an additional data field named scent (of type String) and methods to get and set it. In the child class, override the parent’s setHeight() method to set the price of a ScentedCandle object at $3 per inch.

An example of the DemoCandles program is shown below:

The 6 inch pink candle costs $12.0
The 6 inch gardenia white candle costs $18.0

*/

public class DemoCandles {
    public static void main(String args[]) {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        aCandle.setColor("pink");
        aCandle.setHeight(6);
        aScentedCandle.setColor("white");
        aScentedCandle.setScent("gardenia");
        aScentedCandle.setHeight(6);

        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() + " candle costs $" + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " + aScentedCandle.getScent() + " " + aScentedCandle.getColor() + " candle costs $" + aScentedCandle.getPrice());
    }
}