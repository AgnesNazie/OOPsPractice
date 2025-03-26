package com.agnes;

import java.util.UUID;

public class BankAccount {
    //create fields for the bank account
    private static int accountCounter = 1000;
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNumber;


    //creates constructor
    public BankAccount(double balance, String customerName, String email, double phoneNumber) {
        this.accountNumber = ++accountCounter;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    //getters

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    //setter

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //deposit method

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited sek" + amount + ". New balance sek " + balance);
        } else {
            System.out.println("invalid deposit amount");
        }

    }
    // withdrawal method with check balance

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn sek " + amount + "New Balance sek " + balance);
        } else {
            System.out.println("insufficient balance or amount");
        }

    }

    // display account details

    public void displayAccountInfo() {
            System.out.println("Account Number " + accountNumber);
            System.out.println("Costumer Name " + customerName);
            System.out.println("Email " + email);
            System.out.println("Contact " + phoneNumber);
            System.out.println("Balance " + balance);


    }
}
