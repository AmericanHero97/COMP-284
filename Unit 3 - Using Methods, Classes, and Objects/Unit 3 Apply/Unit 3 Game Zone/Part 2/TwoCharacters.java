// TwoCharacters.Java - Iakov Taranenko - 2/16/2021

/* 

Unit 3 Game Zone

Question Workspace
1. Computer games often contain different characters or creatures. For example, you might design a game in which alien beings possess specific characteristics such as color, number of eyes, or number of lives. Design a character for a game, creating a class to hold at least three attributes for the character. Include methods to get and set each of the character's attributes. Save the file as MyCharacter. java. Then write an application in which you create at least two characters. In turn, pass each character to a display method that displays the character's attributes. Save the application as TwoCharacters.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

class TwoCharacters {
    public static void main(String[] args) {
        MyCharacter Character1 = new MyCharacter();
        Character1.setName("Joe Mama");
        Character1.setTribe("Monkey Tribe");
        Character1.setRank('A');
        Character1.setHealth(100);
        Character1.setArmour(69);
        Character1.setDamage(10);

        System.out.println("\nCharacter 1:" +
         "\nName   : " + Character1.getName() +
         "\nTribe  : " + Character1.getTribe() +
         "\nRank   : " + Character1.getRank() +
         "\nHealth : " + Character1.getHealth() +
         "\nArmour : " + Character1.getArmour() +
         "\nDamage : " + Character1.getDamage());


         MyCharacter Character2 = new MyCharacter();
         Character2.setName("Alfred Von Heider");
         Character2.setTribe("Human Tribe");
         Character2.setRank('C');
         Character2.setHealth(700);
         Character2.setArmour(20);
         Character2.setDamage(50);
 
         System.out.println("\nCharacter 2:" +
          "\nName   : " + Character2.getName() +
          "\nTribe  : " + Character2.getTribe() +
          "\nRank   : " + Character2.getRank() +
          "\nHealth : " + Character2.getHealth() +
          "\nArmour : " + Character2.getArmour() +
          "\nDamage : " + Character2.getDamage());
    }
}