package week4;

public class Wallet {

    private Card card1;
    private Card card2;
    private int expiredCardCount;

    /**
     * addCard - addCard method checks whether card1 is null.
     * If so, it sets card1 to the new card. If not, it checks card2.
     * If both cards are set already, the method has no effect.
     *
     * @param card card passed
     */
    public void addCard(Card card) {
        if (card1 == null) {
            this.card1 = card;
        }
        else if (card2 == null) {
            this.card2 = card;
        }
    }

    /**
     * Checks if the cards in wallet are null
     *
     * @return the string of the cards
     */
    public String formatCards() {
        if (card1 != null && card2 != null) {
            return "[" + this.card1.format() + "]" + "[" + this.card2.format() + "]";
        }
        else if (card1 != null && card2 == null) {
            return "[" + this.card1.format() + "]";
        }
        else {
            return "[" + this.card2.format() + "]";
        }
    }

    /**
     * Checks if the item is null and then validates the expiry date.
     * If expired it will increment the card count by 1
     *
     * @return total number of cards that have expired - only DriverLicence objects
     */
    public int getExpiredCardCount() {
        if (card1 == null && card2 == null) {
            return this.expiredCardCount;
        }
        if (card1 != null && card2 == null) {
            if (card1.isExpired()) {
                this.expiredCardCount++;
            }
        }
        if (card1 != null && card2 != null) {
            if (card2.isExpired()) {
                this.expiredCardCount++;
            }
        }
        return this.expiredCardCount;
    }
}
