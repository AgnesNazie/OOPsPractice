package com.agnes;

public class Developer extends Person{
    //initialise fields

    private String codeLanguage;

    //constructors for fields


    public Developer(String name, int age, String codeLanguage) {
        super(name, age);
        this.codeLanguage = codeLanguage;
    }
      //getter for language

    public String getCodeLanguage() {
        return codeLanguage;
    }
    //setter for language

    public void setCodeLanguage(String codeLanguage) {
        if (codeLanguage == null || codeLanguage.trim().isEmpty())
            throw new IllegalArgumentException("Code Language cannot be null or empty");
        this.codeLanguage = codeLanguage;
    }
    //create method for code

    void introduce(){
        System.out.println(getName() + " like coding in " + codeLanguage);
    }
}
