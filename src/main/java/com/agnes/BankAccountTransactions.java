package com.agnes;

public class BankAccountTransactions {
    public static void main(String[]args) {
        BankAccount bankAccount = new BankAccount(2000, "Agnes Nazie", "cheagnes@gmail.com", 787926556);
        bankAccount.displayAccountInfo();
        bankAccount.deposit(1000);
        bankAccount.withdrawal(700);
        bankAccount.withdrawal(3000);




    }
}
