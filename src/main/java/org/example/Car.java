package org.example;

public class Car {

    String color;
    int length;
    int size;
    String module;
    String brand;
    int yearOfManufacture;
    int speed;

    public Car(String color, int length, int size, String module, String brand, int speed, int yearOfManufacture) {
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

    public void startCar() {
        System.out.println("Car " + brand + " from model "+ module + " got started");
    }

    public void accelerateSpeed() {
        speed++;
        System.out.println("the current car speed from brand "+ brand + " " + module + " is " + speed);
    }
}
