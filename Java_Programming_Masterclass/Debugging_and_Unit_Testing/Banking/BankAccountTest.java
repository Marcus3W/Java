package Debugging_and_Unit_Testing.Banking;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class BankAccountTest {

    private BankAccount account;
    private static int count; // STATIC because we only want one instance of this variable and not linked to objects

    /**
     *  MAYBER WE ONLY WANT TO RUN THE METHOD ONCE, UNLIKE THE BELOW WHERE ITS RUN EACH TIME BEFORE EACH TEST
     *  BeforeAll – denotes that the annotated method will be executed before all test
     *              methods in the current class (previously @BeforeClass)
     */
    @org.junit.jupiter.api.BeforeAll
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    /**
     *  CREATED THIS SO WE CAN CREATE THE OBJECT INSTEAD OF HAVING IT CREATING IN EACH TEST
     *  BeforeEach – denotes that the annotated method will be executed before each test method (previously @Before)
     */
    @org.junit.jupiter.api.BeforeEach
    public void setup() {
        account = new BankAccount("Marc", "Wheeler", 500.00, BankAccount.CHECKING);
        System.out.println("Running a test");
    }



    @org.junit.jupiter.api.Test
    void deposit() throws Exception  {
        double balance = account.deposit(1000.00, true);
        assertEquals(1500.00, balance, 0); // third param is delta, gives a 'leeway' on double figures
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() throws Exception {
        double balance = account.withdraw(300.00, true);
        assertEquals(200.00, balance, 0);
    }

    /**
     * EXAMPLE OF THROWING EXCEPTION
     *
     * @throws Exception if balance is less that 0.
     */
    @org.junit.jupiter.api.Test
    void withdraw_notBranch() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> {
            double balance = account.withdraw(600.00, false);
            assertEquals(200.00, balance, 0);
        });
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposit(1000.00, true);
        assertEquals(1500.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(300.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        assertTrue(account.isCHECKING(), "The account is NOT a checking account");
        // when checking boolean, use assertTrue or assertFalse, instead of assertEquals
    }

    /*
    // ASSERT - state a fact or belief confidently and forcefully.
    //        - The first parameter is what we expect, and the second is what we want to test / actual value
    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(20,21);
    }
    */

    /**
     * AfterAll – denotes that the annotated method will be executed after all
     *             test methods in the current class (previously @AfterClass)
     */
    @org.junit.jupiter.api.AfterAll
    public static void AfterClass() {
        System.out.println("This executes AFTER any test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.AfterEach
    public void teardown() {
        System.out.println("Count = " + count++);
    }

}