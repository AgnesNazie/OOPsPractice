package com.agnes;

public class Animal {
    void speak () {
        System.out.println("Speak");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meow! Meow!");
    }
}
 class AnimalTest{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myCat.speak();
        myDog.speak();
    }
}
