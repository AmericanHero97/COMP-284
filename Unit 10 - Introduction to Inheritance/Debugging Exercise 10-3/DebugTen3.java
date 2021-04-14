// DebugTen3.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-3

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// A PhoneBook is a Book with a city
import java.util.*;
    public class DebugTen3 {
    public static void main(String[] args) {
        String area, inStr;
        int pages;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter city for phone book");
        area = input.next();
        System.out.println("Enter number of pages in " + area + "'s phone book");
        inStr = input.next();
        pages = Integer.parseInt(inStr);

        DebugPhoneBook pb = new DebugPhoneBook(pages, area);
        pb.display();
    }
}