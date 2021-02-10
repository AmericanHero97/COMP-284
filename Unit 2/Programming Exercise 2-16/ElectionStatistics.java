// ElectionStatistics.Java - Iakov Taranenko - 2/2/2021

/* 

Programming Exercise 2-16

Write a program that accepts the names of three political parties and the number of votes each received in the last mayoral election. Display the percentage of the vote each party received.

An example of the program is shown below:

Enter name for first party >> Pool Party
Enter votes received >> 87
Enter name for second party >> House Party
Enter votes received >> 54
Enter name for third party >> Surprise Party
Enter votes received >> 111
The Pool Party party got 34.523809523809526 percent of the vote
The House Party party got 21.428571428571427 percent of the vote
The Surprise Party party got 44.047619047619044 percent of the vote

*/

import java.util.Scanner;
class ElectionStatistics {
    public static void main(String[] args) {
        Scanner inputService = new Scanner(System.in);

        System.out.println("Enter name for first party >> ");
        String FirstPartyName = inputService.nextLine();
        System.out.println("Enter votes received >> ");
        int FirstPartyVotes = inputService.nextInt();
        inputService.nextLine();

        System.out.println("Enter name for second party >> ");
        String SecondPartyName = inputService.nextLine();
        System.out.println("Enter votes received >> ");
        int SecondPartyVotes = inputService.nextInt();
        inputService.nextLine();

        System.out.println("Enter name for third party >> ");
        String ThirdPartyName = inputService.nextLine();
        System.out.println("Enter votes received >> ");
        int ThirdPartyVotes = inputService.nextInt();
        inputService.nextLine();

        double TotalVotes = FirstPartyVotes + SecondPartyVotes + ThirdPartyVotes;
        double FirstPercent = (FirstPartyVotes/TotalVotes) * 100.0;
        double SecondPercent = (SecondPartyVotes/TotalVotes) * 100.0;
        double ThirdPercent = (ThirdPartyVotes/TotalVotes) * 100.0;

        System.out.println("The " + FirstPartyName + " got " + FirstPercent + " percent of the vote");
        System.out.println("The " + SecondPartyName + " got " + SecondPercent + " percent of the vote");
        System.out.println("The " + ThirdPartyName + " got " + ThirdPercent + " percent of the vote");
    }
}