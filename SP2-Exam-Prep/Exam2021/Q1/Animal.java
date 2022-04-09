package Exam2021.Q1;

public class Animal {

    public int foo(Object o) {
        return 1;
    }
    protected int foo(String s) {
        return 2;
    }
    public int foo(Animal b) {
        return 3;
    }
    public void foo(Object o, String s) {
    }
}
