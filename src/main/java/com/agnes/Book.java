package com.agnes;

public class Book {
    //fields
    String title;
    String author;
    int pages;
    //constructor

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    //method
    void printInfo(){
        System.out.println("Title: " + title + " Author: " + author + "Pages: " + pages);
    }
}
