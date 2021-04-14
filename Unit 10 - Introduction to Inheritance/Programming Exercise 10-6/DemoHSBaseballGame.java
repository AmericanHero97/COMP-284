// DemoLLBaseballGame.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-6

Create a class named BaseballGame that contains data fields for two team names and scores for each team in each of nine innings. names should be an array of two strings and scores should be a two-dimensional array of type int; the first dimension indexes the team (0 or 1) and the second dimension indexes the inning.

Create get and set methods for each field. The get and set methods for the scores should require a parameter that indicates which inning’s score is being assigned or retrieved. Do not allow an inning score to be set if all the previous innings have not already been set. If a user attempts to set an inning that is not yet available, issue an error message.

Also include a method named display in DemoBaseballGame.java that determines the winner of the game after scores for the last inning have been entered. (For this exercise, assume that a game might end in a tie.)

Create two subclasses from BaseballGame: HighSchoolBaseballGame and LittleLeagueBaseballGame. High school baseball games have seven innings, and Little League games have six innings. Ensure that scores for later innings cannot be accessed for objects of these subtypes.

*/

import java.util.*;
public class DemoHSBaseballGame {
    public static void main(String[] args) {
        // Write the demo program here
    }
}