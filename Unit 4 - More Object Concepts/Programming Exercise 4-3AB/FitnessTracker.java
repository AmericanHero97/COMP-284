// FitnessTracker.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3AB

a. Modify the FitnessTracker class that includes data fields for a fitness activity, the number of minutes spent participating, and the date. The class includes methods to get each field. In addition, create a default constructor that automatically sets the activity to running, the minutes to 0, and the date to January 1 of the current year. Create an application that demonstrates each method works correctly.

b. Create an additional overloaded constructor for the FitnessTracker class you created in Exercise 3a. This constructor receives parameters for each of the data fields and assigns them appropriately. Add any needed statements to the TestFitnessTracker.java application to ensure that the overloaded constructor works correctly, save it, and then test it.

An example of the program is shown below:

running 0 minutes on 2021-01-01
bicycling 35 minutes on 2020-08-20

*/

import java.time.*;

public class FitnessTracker {
    String activity;
    int minutes;
    LocalDate date;

    public FitnessTracker() {
        activity = "running";
        minutes = 0;
        date = LocalDate.of(2021, 1, 1);
    }

    public FitnessTracker(String a, int m, LocalDate d) {
        activity = a;
        minutes = m;
        date = d;
    }

    public String getActivity() {
        return activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public LocalDate getDate() {
        return date;
    }
}