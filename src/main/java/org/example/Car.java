package org.example;

public class Car {

    String color;

    int length;
    int size;
    String module;
    String brand;
    String yearOfManufacture;
    int speed = 100;

    public Car(String color, int length, int size, String module, String brand, int speed) {
        this.color = color;
        this.length = length;
        this.size = size;
        this.module = module;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public Car() {

    }

    public static void startCar() {
        System.out.println("Starting the car");
    }

    public void accelerateSpeed(int speed) {
        this.speed = speed + 100;
        System.out.println(this.speed);
    }
}
