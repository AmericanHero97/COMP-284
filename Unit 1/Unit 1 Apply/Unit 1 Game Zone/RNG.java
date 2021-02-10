// RNG.Java - Iakov Taranenko - 2/2/2021

/* 

Unit 1 Game Zone

In 1952, A. S. Douglas wrote his University of Cambridge Ph.D. dissertation on human-computer interaction, and created the first graphical computer game—a version of Tic-Tac-Toe. The game was programmed on an EDSAC vacuum-tube mainframe computer. The first computer game is generally assumed to be “Spacewar!”, developed in 1962 at MIT; the first commercially available video game was “Pong,” introduced by Atari in 1973. In 1980, Atari’s “Asteroids” and “Lunar Lander” became the first video games to be registered in the U.S. Copyright Office. Throughout the 1980s, players spent hours with games that now seem very simple and unglamorous; do you recall playing “Adventure,” “Oregon Trail,” “Where in the World Is Carmen Sandiego?,” or “Myst”?

Today, commercial computer games are much more complex; they require many programmers, graphic artists, and testers to develop them, and large management and marketing staffs are needed to promote them. A game might cost many millions of dollars to develop and market, but a successful game might earn hundreds of millions of dollars. Obviously, with the brief introduction to programming you have had in this chapter, you cannot create a very sophisticated game. However, you can get started.

For games to hold your interest, they almost always include some random, unpredictable

behavior. For example, a game in which you shoot asteroids loses some of its fun if the asteroids follow the same, predictable path each time you play the game. Therefore, generating random values is a key component in creating most interesting computer games.

Appendix D contains information about generating random numbers. To fully understand the process, you must learn more about Java classes and methods. For now, however, you can copy the following statement to generate and use a dialog box that displays a random number between 1 and 10:

JOptionPane.showMessageDialog(null,"The number is "+

(1 + (int)(Math.random() * 10)));

Write a Java application that displays two dialog boxes in sequence. The first asks you to think of a number between 1 and 10. The second displays a randomly generated number; the user can see whether his or her guess was accurate. (In future chapters, you will improve this game so that the user can enter a guess and the program can determine whether the user was correct. If you wish, you also can tell the user how far off the guess was, whether the guess was high or low, and provide a specific number of repeat attempts.) Save the file as RandomGuess.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

import javax.swing.JOptionPane;

class RNG {
    public static void main(String[] args) {
        int Guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number and see if you're correct"));
        int Answer = (1 + (int)(Math.random() * 10));

        if (Guess == Answer) {
            JOptionPane.showMessageDialog(null, "You were correct! Your number was " + Answer);
        } else {
            JOptionPane.showMessageDialog(null, "You were wrong, your number was " + Answer);
        }
    }
}