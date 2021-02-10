// PickTwoCards.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Game Zone

Question Workspace
1. Playing cards are used in many computer games, including versions of such classics as solitaire, hearts, and poker. Design a Card class that contains a character data field to hold a suit (s for spades, h for hearts, d for diamonds, or c for clubs) and an integer data field for a value from 1 to 13. (When you learn more about string handling in the chapter "Characters, Strings, and the StringBuilder," you can modify the class to hold words for the suits, such as spades or hearts, as well as words for some of the values—for example, ace or king.) Include get and set methods for each field. Save the class as Card.java.

Write an application that randomly selects two playing cards and displays their values. Simply assign a suit to each of the cards, but generate a random number for each card's value. Appendix D contains information about generating random numbers. To fully understand the process, you must learn more about Java classes and methods. However, for now, you can copy the following statements to generate a random number between 1 and 13 and assign it to a variable:

final int CARDS_IN_SUIT = 13;

myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

After reading the chapter "Making Decisions," you will be able to have the game determine the higher card. For now, just observe how the card values change as you execute the program multiple times. Save the application as PickTwoCards.java.

You use the Math.random() function to generate a random number. The function call uses only a class and method name—no object—so you know the random() method must be a static method.

Create a zip file of the .java file(s) and submit the assignment.

*/

