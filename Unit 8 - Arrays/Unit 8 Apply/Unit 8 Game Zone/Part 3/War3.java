// War3.Java - Iakov Taranenko - 3/23/2021

/* 

Unit 8 Game Zone

a. In Chapter 7, you modified a previously created Card class so that each Card would hold the name of a suit (Spades, Hearts, Diamonds, or Clubs) as well as a value (Ace, King, Queen, Jack, or a number value). Now, create an array of 52 Card objects, assigning a different value to each Card, and display each Card. Save the application as FullDeck.java.

b. In Chapter 7, you created a War2 card game that randomly selects two Card objects (one for the player and one for the computer) and declares a winner or a tie based on the card values. Now create a game that plays 26 rounds of War, dealing a full deck with no repeated cards. Some hints:

-Start by creating an array of all 52 playing cards, as in Part a of this exercise.
-Select a random number for the deck position of the player's first card, and assign the card at that array position to the player.
-Move every higher-positioned card in the deck "down" one to fill in the gap. In other words, if the player's first random number is 49, select the card at position 49, move the card that was in position 50 to position 49, and move the card that was in position 51 to position 50. Only 51 cards remain in the deck after the player's first card is dealt, so the available-card array is smaller by one.
-In the same way, randomly select a card for the computer and "remove" the card from the deck.
-Display the values of the player's and computer's cards, compare their val­ues, and determine the winner.
-When all the cards in the deck are exhausted, display a count of the num­ber of times the player wins, the number of times the computer wins, and the number of ties.

Save the game as War3.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

