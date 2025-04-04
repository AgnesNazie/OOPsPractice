package com.agnes;

public class Developer {
    //initialise fields
    private String name;
    private String language;

    //constructors for fields

    public Developer(String name, String language) {
        this.name = name;
        this.language = language;

    }

    //getter for name
    public String getName() {
        return name;
    }
    // setter for name

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty or null");
        this.name = name;
    }
    //getter for language

    public String getLanguage() {
        return language;
    }
    //setter for language

    public void setLanguage(String language) {
        if (language == null || language.trim().isEmpty())
            throw new IllegalArgumentException("Language cannot be null or empty");
        this.language = language;
    }
    //create method for code
    void code(){
        System.out.println("Name " + name + " is coding in " + language);
    }
    void introduce(){
        System.out.println("Hi, I am " + name + " I like coding in " + language);
    }
}
