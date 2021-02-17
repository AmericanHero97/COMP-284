// MyCharacter.Java - Iakov Taranenko - 2/16/2021

/* 

Unit 3 Game Zone

Question Workspace
1. Computer games often contain different characters or creatures. For example, you might design a game in which alien beings possess specific characteristics such as color, number of eyes, or number of lives. Design a character for a game, creating a class to hold at least three attributes for the character. Include methods to get and set each of the character's attributes. Save the file as MyCharacter. java. Then write an application in which you create at least two characters. In turn, pass each character to a display method that displays the character's attributes. Save the application as TwoCharacters.java.

Create a zip file of the .java file(s) and submit the assignment.

*/

class MyCharacter {
    private String Name;
    private String Tribe;
    private char Rank;

    private int Health;
    private int Armour;
    private int Damage;

    public void setName(String NewName) {
        Name = NewName;
    }

    public void setTribe(String NewTribe) {
        Tribe = NewTribe;
    }

    public void setRank(char NewRank) {
        Rank = NewRank;
    }

    public void setHealth(int NewHealth) {
        Health = NewHealth;
    }

    public void setArmour(int NewArmour) {
        Armour = NewArmour;
    }

    public void setDamage(int NewDamage) {
        Damage = NewDamage;
    }

    public String getName() {
        return Name;
    }

    public String getTribe() {
        return Tribe;
    }

    public char getRank() {
        return Rank;
    }

    public int getHealth() {
        return Health;
    }

    public int getArmour() {
        return Armour;
    }

    public int getDamage() {
        return Damage;
    }
}