// CollegeCourse.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-8

Create a class named CollegeCourse that includes the following data fields:

dept (String) - holds the department (for example, ENG)
id (int) - the course number (for example, 101)
credits (double) - the credits (for example, 3)
price (double) - the fee for the course (for example, $360).
All of the fields are required as arguments to the constructor, except for the fee, which is calculated at $120 per credit hour. Include a display() method that displays the course data. For example, if dept is SE, id is 225, and credits is 3, the output from the display() method should be:

SE225
Non-lab course
3.0 credits
Total fee is $360.0
Create a subclass named LabCourse that adds $50 fee to the course price. Override the parent class display() method to indicate that the course is a lab course and to display all the data. For example, if dept is 'BIO', id is 201, and credits is 4, the output from the display() method should be:

BIO201
Lab course
4.0 credits
Lab fee is $50
Total fee is $530.0
    
*/
import java.util.*;
public class CollegeCourse {
    final int FEE_PER_CREDIT = 120;
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;

    public CollegeCourse(String d, int i, double c) {
        dept = d;
        id = i;
        credits = c;
        price = c * FEE_PER_CREDIT;
    }

    public void display() {
        System.out.println(dept + id + "\nNon-lab course\n" +  credits + " credits\nTotal fee is $" + price);
    }
}