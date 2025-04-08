package com.agnes;

public class BankAccount1 {
    //fields
    private String accountHolder;
    private double balance;
    //constructor

    public BankAccount1(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //getter for accountholder

    public String getAccountHolder() {
        return accountHolder;
    }
    //getter for balance

    public double getBalance() {
        return balance;
    }
    //setter for balance

    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    //method for deposit
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + "Total balance " + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    // method for withdrawal
    void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "total balance " + balance);
        } else {
            System.out.println("Insufficient balance");
        }

    }
    void displayAccountHolderInfo(){
        System.out.println("AccountHolder" + accountHolder + "Balance " + balance);
    }
}
