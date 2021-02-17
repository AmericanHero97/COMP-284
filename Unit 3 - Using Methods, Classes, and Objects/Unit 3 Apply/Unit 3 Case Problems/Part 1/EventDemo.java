// EventDemo.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

c. Use the CarlysEventPriceWithMethods class you created in Step 1a as a starting point for a program that demonstrates the Event class you created in Step 1b, but make the following changes:

-You already have a method that gets a number of guests from a user; now add a method that gets an event number. The main() method should declare an Event object, call the two data entry methods, and use their returned values to set the fields in the Event object.
-Call the method from the CarlysEventPriceWithMethods class that displays the company motto with the border. The method is accessible because it is public, but you must fully qualify the name because it is in another class.
-Revise the method that displays the event details so that it accepts the newly created Event object. The method should display the event number, and it should still display the number of guests, the price per guest, the total price, and whether the event is a large event.

Save the program as EventDemo.java.

*/

class EventDemo {
    public static void main(String[] args) {
        Event Event = new Event();
        Event.setEventNumber(CarlysEventPriceWithMethods.GetEventNumber());
        Event.setGuestsAttending(CarlysEventPriceWithMethods.GetGuestsAttending());

        CarlysEventPriceWithMethods.DisplayMotto();
        CarlysEventPriceWithMethods.CalculateParty(Event);
    }
}