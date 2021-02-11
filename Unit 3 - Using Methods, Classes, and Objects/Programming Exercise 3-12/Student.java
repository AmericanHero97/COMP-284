// Student.Java - Iakov Taranenko - 2/10/2021

/* 

Programming Exercise 3-12

1. Create a class named Student that has fields for an ID number (idNumber), number of credit hours earned (hours), and number of points earned (points). (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.) Include get and set methods for all fields. A Student also has a field for grade point average. Include a getGradePoint() method to compute the grade point average field by dividing points by credit hours earned. Write methods to display the values in each Student field, showIdNumber(), showHours(), etc.

2. Use class named ShowStudent that instantiates a Student object to test your class. Compute the Student grade point average, and then display all the values associated with the Student.

3. Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values.

An example of the program is shown below:

ID Number is: 234
Points Earned: 47
Credit Hours: 15
The grade point average is 3.1333333333333333

*/

class Student {
   private int idNumber;
   private int hours;
   private int points;

   Student() {
       setIdNumber(9999);
       setPoints(12);
       setHours(3);
   }

   public void setIdNumber(int number) {
      idNumber = number;
   }

   public int getIdNumber() {
      return(idNumber);
   }

   public void setHours(int number) {
      hours = number;
   }

   public int getHours() {
      return(hours);
   }

   public void setPoints(int number) {
      points = number;
   }

   public int getPoints() {
      return(points);
   }

   public void showIdNumber() {
      System.out.println("ID Number is: " + idNumber);
   }

   public void showHours() {
      System.out.println("Points Earned: " + hours);
   }

   public void showPoints() {
      System.out.println("Credit Hours: " + points);
   }

   public double getGradePoint() {
      return((double)points / hours);
   }
}