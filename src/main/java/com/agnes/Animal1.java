package com.agnes;

public class Animal1 {
    //fields
    String name;

    //method sound
    void makeSound() {
        System.out.println("Some generic animal sounds");
    }

    //method eat
    void eat() {
        System.out.println("Name " + name + " is eating");
    }
}

class Bird extends Animal1 {
    void makeSound() {
        System.out.println("Mmmmm! Mmmmm!");
    }

}

class Cow extends Animal1 {
    void makeSound() {
        System.out.println("Crow! Crow!");
    }
}

