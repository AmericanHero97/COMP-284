// UseCourse.Java - Iakov Taranenko - 4/13/2021

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
public class UseCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dept, inStr;
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
        int id, credits;
        int found = 0;
        int x;

        System.out.print("Department >> ");
        dept = input.nextLine();
        System.out.print("Course # >> ");
        id = input.nextInt();
        System.out.print("Credits >> ");
        credits = input.nextInt();

        for (x = 0; x < labCourses.length; x++)
            if (dept.equals(labCourses[x]))
                found = 1;
        
        if (found == 1) {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        } else {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
    }
}