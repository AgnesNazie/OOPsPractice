package com.agnes;

public class TestBankAccount1 {
    public static void main(String[] args) {
        BankAccount1 bankAccount1 = new BankAccount1("Agnes", 1000.0);
        bankAccount1.deposit(1500);
        bankAccount1.withdrawal(1000.0);
        bankAccount1.withdrawal(2500);
        bankAccount1.displayAccountHolderInfo();
    }
}
