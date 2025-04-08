package com.agnes;

public class TestAnimal1 {
    public static void main(String[] args) {
       Bird bird = new Bird();
       bird.name = "Big";
       bird.makeSound();
       bird.eat();
       Cow cow = new Cow();
       cow.name = "Bow";
       cow.makeSound();
       cow.eat();



    }
}
