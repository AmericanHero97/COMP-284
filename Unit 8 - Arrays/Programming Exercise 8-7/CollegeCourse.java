// CollegeCourse.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-7

A. Implement the CollegeCourse class. The class contains fields for the course ID (for example, CIS 210), credit hours (for example, 3), and a letter grade (for example, A). Include get and set methods for each field.

Next, create the Student class containing an ID number and an array of five CollegeCourse objects. Create a get and set method for the student's ID number. Also create a get method that returns one of the student's CollegeCourses; the method takes an integer argument and returns the CollegeCourse in that position (0 through 4). Next, create a set method that sets the value of one of the Student’s CollegeCourse objects; the method takes two arguments—a CollegeCourse and an integer representing the CollegeCourse’s position (0 through 4).

B. Write an application that prompts a professor to enter grades for five different courses each for 10 students. Prompt the professor to enter data for one student at a time, including student ID and course data for five courses. Use prompts containing the number of the student whose data is being entered and the course number—for example, Enter ID for student #1, and Enter course ID #5. Verify that the professor enters only A, B, C, D, or F for the grade value for each course. After all the data has been entered, display all the information in order by student then course as shown:

Student #1  ID #101
CS1 1  -- credits. Grade is A
CS2 2  -- credits. Grade is B
CS3 3  -- credits. Grade is C
CS4 4  -- credits. Grade is D
CS5 5  -- credits. Grade is F

*/

public class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;

    public String getID() {

    }

    public int getCredits() {

    }

    public char getGrade() {

    }

    public void setID(String idNum) {

    }

    public void setCredits(int cr) {

    }

    public void setGrade(char gr) {
        
    }
}