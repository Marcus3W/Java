package Labs.week3;

/**
 * A class to test the Door class.
 */
public class DoorTester {
    /**
     * Tests the methods of the Door class
     * @param args not used
     */
    public static void main(String[] args) {
        Door frontDoor = new Door("Front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        System.out.println("Expected: open");
        Door backDoor = new Door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: closed");
// Use the mutator to change the state variable
        backDoor.setState("open");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: open");
// Use the mutator to change the name variable
        backDoor.setName("Kitchen");
        System.out.println("The back door is called " + backDoor.getName());
        System.out.println("Expected: Kitchen");

        Door sideDoor = new Door("Side", "closed");
        System.out.println("The back door is " + sideDoor.getState());
        System.out.println("Expected: closed");
        System.out.println("The side door is called " + sideDoor.getName());
        System.out.println("Expected: Side");


        /**
         * QUESTION 8:
         * Consider the variable state in the class Door and the variable newState in the
         * mutator for state.
         * What kind of variable is state?      -- Instance variable
         * What kind of variable is newState?   --
         * When do these variables exist?       --
         *
         */

        /**
         * QUESTION 9:
         * Consider the line below:
         *      backDoor.setState("open");
         * What is the implicit parameter that is passed by this method call? -- backDoor is the Implicit parameter
         * What is the explicit parameter?                                    -- "open" is the Explicit parameter
         *
         */


    }
}
