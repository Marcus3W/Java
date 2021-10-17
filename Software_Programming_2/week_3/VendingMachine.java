package Labs.week3;

public class VendingMachine {

    private int canCount;
    private int tokenCount;

    // CONSTRUCTORS
    // NOTES - Question 18 asked s for the first constructor to call the second - meaning we will always start
    //         with 10 cans, plus however many extra if the 2nd constructor is called.
    public VendingMachine() {
        this(10);
    }
    public VendingMachine(int canCount) {
        this.canCount = canCount;
        this.tokenCount = 0;
    }

    // METHODS
    public void fillUp(int cans) {
        this.canCount += cans;
    }

    public void insertToken() {
        this.tokenCount++;
    }

    // GETTERS
    public int getCanCount() {
        return canCount;
    }

    public int getTokenCount() {
        return tokenCount;
    }

}
