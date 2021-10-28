package week4;

public class IDCard extends Card {

    private String idNumber;

    /**
     * Constructs a IDCard object.
     */
    public IDCard(String name, String idNumber) {
        super(name);
        this.idNumber = idNumber;
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
     * Returns a String representation of instance variables
     *
     * @return string denoting the object
     */
    @Override
    public String toString() {
        return super.toString() +
                "[id = " + this.idNumber + "]";
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

        IDCard card = (IDCard) other;

        return this.idNumber.equals(card.idNumber);
    }
}
