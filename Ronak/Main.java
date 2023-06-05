package com.Ronak;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("tommy", 3);
        Cat cat = new Cat("mini", 5);

        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        dog.makeSound();

        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat age: " + cat.getAge());
        cat.makeSound();
    }
}
       