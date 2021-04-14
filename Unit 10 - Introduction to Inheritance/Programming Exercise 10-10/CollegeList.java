// Student.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-10

Develop a set of classes for a college to use in various student service and personnel applications. Classes you need to design include the following:

• Person — A Person contains the following fields, all of type String: firstName, lastName, address, zip, phone. The class also includes a method named setData that sets each data field by prompting the user for each value and a display method that displays all of a Person’s information on a single line at the command line on the screen. For example:

Joe Smith 111-N-Student-Lane 88888 888-888-8888
• CollegeEmployee — CollegeEmployee descends from Person. A CollegeEmployee also includes a Social Security number (ssn of type String), an annual salary (annualSalary of type double), and a department name (dept of type String), as well as methods that override the setData and display methods to accept and display all CollegeEmployee data in addition to the Person data. The display method should display the Person fields on one line, and the additional CollegeEmployee fields on the next, for example:

Jane Smith 111-W-College-Rd 88888 888-888-8888
SSN: 123-45-6789 Salary $80000.0 Department: CS
• Faculty — Faculty descends from CollegeEmployee. This class also includes a Boolean field named isTenured that indicates whether the Faculty member is tenured, as well as setData and display methods that override the CollegeEmployee methods to accept and display this additional piece of information. An example of the output from display is:

Jane Smith 111-W-College-Rd 88888 888-888-8888
SSN: 123-45-6789 Salary $90000.0 Department: SE
Faculty member is tenured
If the faculty member is not tenured, the third line should read Faculty member is not tenured.

• Student— Student descends from Person. In addition to the fields available in Person, a Student contains a major field of study (major of type String) and a grade point average (gpa of type double) as well as setData and display methods that override the Person methods to accept and display these additional facts. An example of the output from display is:

Joe Smith 111-N-Student-Lane 88888 888-888-8888
Major: Biology  GPA: 3.47
There should be two spaces before 'GPA' on the second line.

Write an application named CollegeList that declares an array of four “regular” CollegeEmployee objects, three Faculty objects, and seven Student objects. Prompt the user to specify which type of person’s data will be entered (C, F, or S), or allow the user to quit (Q). While the user chooses to continue (that is, does not quit), accept data entry for the appropriate type of Person.

If the user attempts to enter data for more than four CollegeEmployee objects, three Faculty objects, or seven Student objects, display an error message. When the user quits, display a report on the screen listing each group of Persons under the appropriate heading of “College Employees,” “Faculty,” or “Students.” If the user has not entered data for one or more types of Persons during a session, display an appropriate message under the appropriate heading.

*/

import java.util.*;
public class CollegeList {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        CollegeEmployee[] emp = new CollegeEmployee[4];
        Faculty[] faculty = new Faculty[3];
        Student[] student = new Student[7];

        int empCount = 0, facCount = 0, stuCount = 0;

        System.out.println("Type C, F or S to enter data for" + "\n(C)ollege employee\n(F)aculty\n(S)tudent" + "\nor type Q to quit");
        char input = InputService.nextLine().charAt(0);

        while (input != 'Q') {
            if (input == 'C') {
                if (empCount < emp.length) { 
                    CollegeEmployee c = new CollegeEmployee();
                    c.setData();
                    emp[empCount] = c;
                    empCount++;
                } else {
                    System.out.println("Sorry - too many employee records have been entered");
                }
            } else if(input == 'F') {
                if (facCount < faculty.length) { 
                    Faculty f = new Faculty();
                    f.setData();
                    faculty[facCount] = f;
                    facCount++;
                } else {
                    System.out.println("Sorry - too many faculty records have been entered");
                }
            } else if (input == 'S') {
                if (stuCount < student.length) { 
                    Student s = new Student();
                    s.setData();
                    student[stuCount] = s;
                    stuCount++;
                } else {
                    System.out.println("Sorry - too many student records have been entered");
                }
            }

            System.out.println("Type C, F or S to enter data for" + "\n(C)ollege employee\n(F)aculty\n(S)tudent" + "\nor type Q to quit");
            input = InputService.nextLine().charAt(0);
        }

        System.out.println("\nCollege Employees:");
        if (empCount == 0)
            System.out.println("No employees entered");
        else
            for (int x = 0; x < empCount; x++)
                emp[x].display();
        
        System.out.println("\nFaculty:");
        if (facCount == 0)
            System.out.println("No faculty entered");
        else
            for (int x = 0; x < facCount; x++)
                faculty[x].display();

        System.out.println("\nStudents:");
        if (stuCount == 0)
            System.out.println("No students entered");
        else
            for (int x = 0; x < stuCount; x++)
                student[x].display();
    }    
}