// JobApplicant.Java - Iakov Taranenko - 3/2/2021

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

public class JobApplicant {
    private String name;
    private String phone;
    private boolean hasWordSkill;
    private boolean hasSpreadsheetSkill;
    private boolean hasDatabaseSkill;
    private boolean hasGraphicsSkill;

    public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g) {
        this.name = name;
        this.phone = phone;
        hasWordSkill = w;
        hasSpreadsheetSkill = s;
        hasDatabaseSkill = d; 
        hasGraphicsSkill = g;
    } 

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean getHasWordSkill() {
        return hasWordSkill;
    }

    public boolean getHasSpreadsheetSkill() {
        return hasSpreadsheetSkill;
    }

    public boolean getHasDatabaseSkill() {
        return hasDatabaseSkill;
    }

    public boolean getHasGraphicsSkill() {
        return hasGraphicsSkill;
    }
}