package com.agnes;

public class Person {
    private String name;
    private int age;

    //constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter for name

    public String getName() {
        return name;
    }

    //setter for name
    public String setName() {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        return name;
    }
    //getter for age

    public int getAge() {
        return age;
    }
    //create method to introduce
    void introduce(){
        System.out.println("Hi, I am " + name + " I am " + age + " years old");
    }
}
