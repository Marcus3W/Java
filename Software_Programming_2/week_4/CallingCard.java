package week4;

public class CallingCard extends Card {

    private String cardNumber;
    private String pin;


    /**
     * Constructs a CallingCard object.
     */
    public CallingCard(String name, String cardNumber, String pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    /**
     * Returns a String representation of instance variables
     *
     * @return string denoting the object
     */
    @Override
    public String toString() {
        return super.toString() +
                "[card number = " + this.cardNumber + ", " +
                "pin = " + this.pin + "]";
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

        CallingCard card = (CallingCard) other;

        return this.cardNumber.equals(card.cardNumber);
    }

}
