package com.homework.oop.composition;

public class Bank_main {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        User user1 = bank.createUser("Anna", "Mostypan", 28);
        User user2 = bank.createUser("Lina", "Bondar", 29);

        Account a1 = new Account(1000);
        CreditAccount a2 = new CreditAccount(1000, 200);

        user1.addAccount(a1);
        user2.addAccount(a2);
        bank.printAllUsers();
        System.out.println();

        bank.transfer(a1,a2,300);
        bank.printAllUsers();

    }
}
