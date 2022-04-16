package Intermediate_Java.Generics.Interfaces;

import Intermediate_Java.Generics.Intro.StringBag;

public class main {

    public static void main(String[] args) {

        Replacer<Integer> boxReplacer = new Box<>();  // Using generic `Box` implementation
        Replacer<String> bagReplacer = new StringBag();  // Using non-generic `StringBag` implementation

        /*
        * In the example above we created two Replacer references.
        * The Box implementation can be of any type but the StringBag implementation
        * needs to be a <String> type because of the non-generic class implementation.
        */
    }
}
