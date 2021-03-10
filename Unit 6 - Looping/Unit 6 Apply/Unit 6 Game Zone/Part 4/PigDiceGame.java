// PigDiceGame.Java - Iakov Taranenko - 3/9/2021

/* 

Unit 6 Game Zone

a. Using the Die class you created in Chapter 4, create a version of the dice game Pig that a user can play against the computer. The object of the game is to be the first to score 100 points. The user and computer take turns rolling a pair of dice following these rules:
    On a turn, each player "rolls" two dice. If no 1 appears, the dice values are added to a running total, and the player can choose whether to roll again or pass the turn to the other player.
    If a 1 appears on one of the dice, nothing more is added to the player's total and it becomes the other player's turn.
    If a 1 appears on both of the dice, not only is the player's turn over, but the player's entire accumulated score is reset to 0.
    In this version of the game, when the computer does not roll a 1 and can choose whether to roll again, generate a random value between 0 and 1. Have the computer continue to roll the dice when the value is 0.5 or more, and have the computer quit and pass the turn to the player when the value is not 0.5 or more.
    Save the game as PigDiceGame.java.

b. Modify the PigDiceGame application so that if a player rolls a 1, not only does the player's turn end, but all the player's earned points during that round are eliminated. (Points from earlier rounds are not affected. That is, when either the player or computer rolls a 1, all the points accumulated since the other's turn are subtracted.) Save the game as PigDiceGame2.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

