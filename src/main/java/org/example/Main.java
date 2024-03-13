package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.accelerateSpeed(100);

        Person person = new Person("Basel", 29);
        Person person1 = new Person("jemand", 100);
    }
}