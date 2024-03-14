package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.module = "3";
        car.startCar();
        car.accelerateSpeed();
        car.accelerateSpeed();
        car.accelerateSpeed();
        car.accelerateSpeed();

        Person person = new Person("Basel", 29, 0, null, null);
        Person person1 = new Person("jemand", 100, 0, null, null);
    }
}