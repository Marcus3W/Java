package week4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicence extends IDCard {

    private int expirationYear;

    /**
     * Constructs a DriverLicence object. Data obtained from it's
     * super class, then the super class of that.
     */
    public DriverLicence(String name, String idNumber, int expirationYear) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
    }

    /**
     * Produces and returns a string of the written format of the card
     *
     * @return formatted String using the super classes formatting mether
     */
    @Override
    public String format() {
        return super.format();
    }

    /**
     * Checks if a driver's licence is valid based on the calendar year
     *
     * @return false if DriverLicence has expired
     */
    @Override
    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int current = calendar.get(Calendar.YEAR);

        if (this.expirationYear < current) {
            return true;
        }
        return this.expirationYear >= GregorianCalendar.YEAR;
    }

    /**
     * Returns a String representation of instance variables
     *
     * @return string denoting the object
     */
    @Override
    public String toString() {

        return super.toString() +
                "[expiry year = " + this.expirationYear + "]";
    }

    /**
     * Returns true if two cards have the same name and class.
     * Returns false if one card is null or not same class.
     *
     * Note the fancy way of checking the name of the class.  Here
     * we know that the class is Card, but when subclasses run this
     * method we want the subclass.
     *
     * @return true if the two objects are same type and have same
     * instance variable values
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false; }
        if (!this.getClass().equals(other.getClass())) {
            return false; }

        DriverLicence card = (DriverLicence) other;

        return this.expirationYear == (card.expirationYear);
    }
}
