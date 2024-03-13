package org.example;
public class Person {

    String name;
    String gender;
    int age;
    int tall;
    String eyesColor;

    public Person(String name, int age, int tall, String eyesColor, String gender) {
        System.out.println("Hello, I am " + name + ". I'm " + age + " years old");
    }
}
