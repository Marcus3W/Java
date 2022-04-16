package Intermediate_Java.Generics.Interfaces;

public class Box <T> implements Replacer <T> {
    private T data;

    // This Class MUST override all methods in the interface class
    @Override
    public void replace(T data) {
        this.data = data;
    }
}
