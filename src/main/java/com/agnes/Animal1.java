package com.agnes;

public abstract class Animal1{
    //fields
    String name;

    //method sound
    void makeSound() {
        System.out.println("Some generic animal sounds");
    }

    //method eat
    void sleep() {
        System.out.println("Name " + name + " is sleeping");
    }
}

class Bird extends Animal1 implements AnimalMovement {
    @Override
    public void makeSound() {
        System.out.println("Bird Mmmmm! Mmmmm!");
    }
    //eat method
    @Override
    public void sleep(){
        System.out.println("Bird is sleeping on the tree");
    }

    @Override
    public void move1() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird is pecking seeds");

    }
}

class Cow extends Animal1 implements AnimalMovement{
    @Override
    public void makeSound() {
        System.out.println("COW  MOW! Mow!");
    }
    //eat method
    @Override
    public void sleep() {
        System.out.println("Cow is sleeping");
    }

    @Override
    public void move1() {
        System.out.println("Cow is walking.");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating grass");

    }
}
//class for elephant
class Lion extends Animal1 implements  AnimalMovement{
    @Override
    public void makeSound(){
        System.out.println(name + " roar! roar!");
    }
    @Override
    public void sleep(){
        System.out.println("Lion is sleeping under the  tree");
    }

    @Override
    public void move1() {
        System.out.println("Lion is running.");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating ");

    }
}

