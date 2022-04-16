package Intermediate_Java.Generics.Intro;

public class main {
    public static void main(String[] args) {
        String myWord = "Hello";
        //Book myBook = new Book("My Book");

        Container<String> wordContainer = new Container<>(myWord);
        //Container<Book> bookContainer = new Container<>(myBook);

        System.out.println(wordContainer.getData());
        //System.out.println(bookContainer.getData());

    }
}
