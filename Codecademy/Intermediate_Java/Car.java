package Intermediate_Java;

import java.io.*;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;
    private transient String model;
    //private Engine engine;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }



    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);

        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - "+toyotaCopy);
        System.out.println("Toyota (Original) - "+toyota);
        System.out.println("Is same object: "+ isSameObject);

    }
}
