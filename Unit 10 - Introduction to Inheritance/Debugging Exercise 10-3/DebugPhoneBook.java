// DebugPhoneBook.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-3

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

import java.util.*;
public class DebugPhoneBook extends DebugBook {
    private String area;
    private String size;
    private final int CUTOFF = 30;

    DebugPhoneBook(int pages, String city) {
        super(pages);
        area = city;

        if (pages > CUTOFF)
            size = "big";
        else
            size = "small";
    }

    public void display() {
        System.out.println("The phone book for " + area + " has " + pages + " pages.\nThat is a " + size + " phone book."); 
    }
}