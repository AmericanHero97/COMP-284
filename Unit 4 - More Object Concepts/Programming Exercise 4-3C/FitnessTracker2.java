// FitnessTracker2.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3C

Modify the FitnessTracker class, created in Chapter 4 Programming Exercise 3AB, so that the default constructor calls the three-parameter constructor. Use TestFitnessTracker2 to test the new version of the class.

*/

import java.time.*;

public class FitnessTracker2 {
    String activity;
    int minutes;
    LocalDate date;

    public FitnessTracker2() {
        this("running", 0, LocalDate.of(2021, 1, 1));
    }

    public FitnessTracker2(String activityParam, int minutesParam, LocalDate dateParam) {
        activity = activityParam;
        minutes = minutesParam;
        date = dateParam;
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