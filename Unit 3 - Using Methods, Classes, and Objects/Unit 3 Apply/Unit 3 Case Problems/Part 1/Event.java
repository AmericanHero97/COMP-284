// Event.Java - Iakov Taranenko - 2/10/2021

/* 

Unit 3 Case Problems

b. Create a class to hold Event data for Carly's Catering. The class contains:

-Two public final static fields that hold the price per guest ($35) and the cutoff value for a large event (50 guests)
-Three private fields that hold an event number, number of guests for the event, and the price. The event number is stored as a String because Carly plans to assign event numbers such as M312.
-Two public set methods that set the event number (setEventNumber()) and the number of guests (setGuests()). The price does not have a set method because the setGuests() method will calculate the price as the number of guests multiplied by the price per guest every time the number of guests is set.

Three public get methods that return the values in the three nonstatic fields.

*/

class Event {
    private final int PRICE_PER_GUEST = 35;
    private final int LARGE_PARTY_MIN = 50;
    private String EventNumber;
    private int GuestsAttending;
    private double TotalPrice;

    public void setEventNumber(String NewEventNumber) {
        EventNumber = NewEventNumber;
    }

    public void setGuestsAttending(int NewGuestsAttending) {
        GuestsAttending = NewGuestsAttending;

        TotalPrice = GuestsAttending * PRICE_PER_GUEST;
    }

    public String getEventNumber() {
        return EventNumber;
    }

    public int getGuestsAttending() {
        return GuestsAttending;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }
}