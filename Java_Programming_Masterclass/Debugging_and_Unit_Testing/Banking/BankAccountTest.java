package Debugging_and_Unit_Testing.Banking;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount account = new BankAccount("Marc", "Wheeler", 500.00, BankAccount.CHECKING);
        double balance = account.deposit(1000.00, true);
        assertEquals(1500.00, balance, 0); // third param is delta, gives a 'leeway' on double figures
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Marc", "Wheeler", 500.00, BankAccount.CHECKING);
        account.deposit(1000.00, true);
        assertEquals(1500.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount account = new BankAccount("Marc", "Wheeler", 500.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(300.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        BankAccount account = new BankAccount("Marc", "Wheeler", 500.00, BankAccount.CHECKING);
        assertTrue(account.isCHECKING(), "The account is NOT a checking account");
        // when checking boolean, use assertTrue or assertFalse, instead of assertEquals
    }




    // ASSERT - state a fact or belief confidently and forcefully.
    //        - The first parameter is what we expect, and the second is what we want to test / actual value
    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(20,21);

    }



}