package com.agnes;

public class TestAnimal1 {
    public static void main(String[] args) {
        AnimalMovement animalMovement1 = new Bird();
        animalMovement1.makeSound();
        animalMovement1.sleep();
        animalMovement1.move1();

        AnimalMovement animalMovement2 = new Cow();
        animalMovement2.makeSound();
        animalMovement2.sleep();
        animalMovement2.move1();

        AnimalMovement animalMovement3 = new Lion();
        animalMovement3.makeSound();
        animalMovement3.sleep();
        animalMovement3.move1();

    }
}
