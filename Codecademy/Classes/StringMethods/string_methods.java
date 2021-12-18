package Classes.StringMethods;

public class string_methods {


    public static void main(String[] args) {
        concat();
        equals();
        indexOf();
        chatAt();
        substring();
        toUpperCase();
    }

    /**
     * The concat() method concatenates one string to the end of another string.
     * Concatenation is the operation of joining two strings together.
     *
     * Suppose we have a String called str1 and another String called str2,
     * using str1.concat(str2) would return str1 with str2 appended to the end of it.
     */
    public static void concat() {
        // Add your first names:
        String firstName = "Marc";
        String lastName = "Wheeler";
        // What's the full name?
        System.out.println(firstName.concat(" " + lastName));
    }

    /**
     * With objects, such as Strings,
     * we can’t use the primitive equality operator == to check for equality between two strings.
     * To test equality with strings, we use a built-in method called equals().
     *
     * Side note: there’s also an 'equalsIgnoreCase()' method that compares two strings
     *            without considering upper/lower cases.
     */
    public static void equals() {
        // Examples:
        String flavor1 = "Mango";
        String flavor2 = "Peach";
        System.out.println(flavor1.equals("Mango")); // prints true
        System.out.println(flavor2.equals("Mango")); // prints false

        // Objective:
        String password = "correcthorsebatterystaple";
        // Does it compare?
        System.out.println(password.equals("aaasdsdffghtjjtr"));
    }

    /**
     * If we want to know the index of the first occurrence of a character in a string,
     * we can use the indexOf() method on a string.
     *
     * If it doesn't find a match, it will return -1
     */
    public static void indexOf() {
        // Examples:
        String letters = "ABCDEFGHIJKLMN";
        System.out.println(letters.indexOf("C")); // Answer is 2 (0,1,2)

        String letters2 = "ABCDEFGHIJKLMN";
        System.out.println(letters.indexOf("EFG")); // Answer is 4 as EFT starts at index 4

        // Objective:
        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. " +
                "/ .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

        System.out.println(code.indexOf(". .- -"));
    }

    /**
     * The charAt() method returns the character located at a String‘s specified index.
     */
    public static void chatAt() {
        // Example:
        String str = "qwer";
        System.out.println(str.charAt(2)); // prints out e

        // Objective:
        String firstName = "Marc";
        String lastName = "Wheeler";

        // What are the initials?
        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));
    }

    /**
     * There may be times when we only want a part of a string.
     * In such cases, we may want to extract a substring from a string.
     *
     * The substring() method does exactly that
     *
     * Note: When substring() is called with two arguments,
     * the first argument is inclusive and the second is exclusive
     */
    public static void substring() {
        // Examples:
        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(24)); // Output - 'Constellations rung'

        System.out.println(line.substring(27, 33)); // Output - 'Stella'
        /*
        When substring() is called with two arguments, the first argument is inclusive and the second is exclusive.
        This means the resulting substring will begin at index 27 and extend up to, but not including, index 33.

        Therefore, the example above would output stella
        because that’s the substring that begins at index 27 and ends at index 32, one index before 33.
         */
    }

    /**
     * toUpperCase(): returns the string value converted to uppercase
     * toLowerCase(): returns the string value converted to lowercase
     */
    public static void toUpperCase() {
        // and toLowerCase()
        // Example:
        String input = "Cricket!";
        String upper = input.toUpperCase(); // stores "CRICKET!"
        String lower = input.toLowerCase(); // stores "cricket!"
        System.out.println(input);
        System.out.println(upper);
        System.out.println(lower);
    }
}
