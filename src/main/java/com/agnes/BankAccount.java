package com.agnes;

import java.util.UUID;

public class BankAccount {
    //create fields for the bank account
    String accountNumber;
    double balance;
    String customerName;
    String email;
    int phoneNumber;
    double amount;
    double withdrawal;


    //creates constructor
    public BankAccount (String accountNumber, double withdrawal, double balance, String customerName,String email,int phoneNumber, double amount) {
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        if( withdrawal <= balance){
            this.withdrawal = withdrawal;
        } else{
            throw new IllegalArgumentException("insufficient balance");
        }



    }
}
