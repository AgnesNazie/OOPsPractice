package com.agnes;

public class DevelopersTest {
    public static void main(String[] args) {
        Developer agnes = new Developer("Agnes", "JavaScript");
        Developer javan = new Developer("Javan", "Java");
        Developer elon = new Developer("Elon" , "Python");

        elon.code();
        agnes.introduce();
        javan.introduce();
        elon.setName("Musk");
        elon.introduce();

        // Try setting an invalid name
        try {
            elon.setName(""); // should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
