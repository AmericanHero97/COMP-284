// DemoRocks.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-9

Create a class named Rock that acts as a superclass for rock samples collected and catalogued by a natural history museum. The Rock class contains the following fields:

sampleNumber - of type int
description - A description of the type of rock (of type String)
weight - The weight of the rock in grams (of type double)
Include a constructor that accepts parameters for the sampleNumber and weight. The Rock constructor sets the description value to Unclassified. Include the following methods:

getSampleNumber
getDescription
setDescription
getWeight
Create three child classes named IgneousRock, SedimentaryRock, and MetamorphicRock. The constructors for these classes require parameters for the sampleNumber and weight. Search the Internet for a brief description of each rock type and assign it to the description field using a method named setDescription inside of the constructor.

An example of the DemoRocks program is shown below:

Sample # 123 weighs 4.5
Description:   Unclassified

Sample # 234 weighs 14.9
Description:   Igneous rocks are crystalline solids 
which form directly from the cooling of magma.

Sample # 345 weighs 18.3
Description:   Sedimentary rocks are called secondary, 
because they are often the result of the accumulation 
of small pieces broken off of pre-existing rocks.

Sample # 456 weighs 7.0
Description:   Any rock can become a metamorphic rock 
if the rock is moved into an environment in which the 
minerals which make up the rock become unstable and 
out of equilibrium with the new environmental conditions.

*/

import java.util.*;
public class DemoRocks {
    public static void main(String[] args) {
        Rock RockType1 = new Rock(123, 4.5);
        IgneousRock RockType2 = new IgneousRock(234, 14.9);
        SedimentaryRock RockType3 = new SedimentaryRock(345, 18.3);
        MetamorphicRock RockType4 = new MetamorphicRock(456, 7.0);
        display(RockType1);
        display(RockType2);
        display(RockType3);
        display(RockType4);
    }

    public static void display(Rock rock) {
        System.out.println("\nSample # " + rock.getSampleNumber() + " weighs "+ rock.getWeight());
        System.out.println("Description:   " + rock.getDescription());
    }
}