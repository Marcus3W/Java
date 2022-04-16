package Intermediate_Java.Generics.Intro;

import Intermediate_Java.Generics.Interfaces.Replacer;

public class StringBag implements Replacer<String> {
    private String data;
    //We can also have a non-generic class implement a generic interface by specifying the type argument to the interface. For example:
    @ Override
    public void replace(String data) {
        this.data = data;
    }
}
