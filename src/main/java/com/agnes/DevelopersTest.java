package com.agnes;

public class DevelopersTest {
    public static void main(String[] args) {
        Developer agnes = new Developer("Agnes", 29, "JavaScript");
        Developer javan = new Developer("Javan", 35,"Java");
        Developer elon = new Developer("Elon" , 33,"Python");


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
