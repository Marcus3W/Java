package Debugging_and_Unit_Testing.Banking;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    /**
     * Enables customer to add funds to their account
     * @param amount amount of funds to be deposited into the account
     * @param branch argument is true if the customer is performing the transaction at a branch, with a teller.
     *               It is false if the customer is performing the transaction at an ATM
     * @return updated balance
     */
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }
    /**
     * Enables customer to withdraw funds from their account
     * @param amount amount of funds to be withdrawn into the account
     * @param branch argument is true if the customer is performing the transaction at a branch, with a teller.
     *               It is false if the customer is performing the transaction at an ATM
     * @return updated balance
     */
    public double withdraw(double amount, boolean branch) {
        if ((amount > 500) && (!branch)) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }


    public boolean isCHECKING() {
        return accountType == CHECKING;
    }

    // More methods that use the firstName, lastName, and perform other functions...

}