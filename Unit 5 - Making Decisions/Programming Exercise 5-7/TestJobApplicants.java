// TestJobApplicants.Java - Iakov Taranenko - 3/2/2021

/* 

Programming Exercise 5-7

Create a class in JobApplicant.java that holds data about a job applicant. Include a name, a phone, and four Boolean fields, hasWordSkill, hasSpreadsheetSkill, hasDatabaseSkill, and hasGraphicsSkill, that represent whether the applicant is skilled in each of the following areas: word processing, spreadsheets, databases, and graphics. Include a constructor that accepts values for each of the fields. Also implement a get method for each field. The get method should be the field name prefixed with 'get'. For example, the get method for name should be called getName.

Create an application in TestJobApplicants.java that instantiates several job applicant objects and pass each in turn to a Boolean method named isQualified that determines whether each applicant is qualified for an interview. Then, in the main() method, display an appropriate method for each applicant. A qualified applicant has at least three of the four skills.

An example of the program is shown below:

Johnson is not qualified for an interview at this time     Phone: 312-345-9875
Kermit is not qualified for an interview at this time     Phone: 312-543-1275
Lawrence is qalified for an interview     Phone: 608-288-09125
Mitchell is qalified for an interview     Phone: 815-288-3881

*/

import java.util.Scanner;

public class TestJobApplicants {
    public static void main(String[] args) {
        // JobApplicant(name, phone, hasWordSkill, hasSpreadsheetSkill, hasDatabaseSkill, hasGraphicsSkill)
        JobApplicant app1 = new JobApplicant("Johnson", "312-345-9875", true, false, true, false);
        JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275", true, false, false, false);
        JobApplicant app3 = new JobApplicant("Lawrence", "608-288-09125", true, false, true, true);
        JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881", true, true, true, true);
        String qualifiedMsg = "is qualified for an interview   ";
        String notQualifiedMsg = "is not qualified for an interview at this time   ";

        if (isQualified(app1))
            display(app1, qualifiedMsg);
        else
            display(app1, notQualifiedMsg);

        if (isQualified(app2))
            display(app2, qualifiedMsg);
        else
            display(app2, notQualifiedMsg);

        if (isQualified(app3))
            display(app3, qualifiedMsg);
        else
            display(app3, notQualifiedMsg);

        if (isQualified(app4))
            display(app4, qualifiedMsg);
        else
            display(app4, notQualifiedMsg);
    }

    public static boolean isQualified(JobApplicant app) {
        final int QUALATIES_NEEDED = 3;
        int qualaties = 0;

        if (app.getHasWordSkill())
            qualaties = qualaties + 1;
        if (app.getHasSpreadsheetSkill())
            qualaties = qualaties + 1;
        if (app.getHasDatabaseSkill())
            qualaties = qualaties + 1;
        if (app.getHasGraphicsSkill())
            qualaties = qualaties + 1;
        
        return (qualaties >= QUALATIES_NEEDED);
    }

    public static void display(JobApplicant app, String msg) {
        System.out.println(app.getName() + " " + msg + "  Phone: " + app.getPhone());
    }
}