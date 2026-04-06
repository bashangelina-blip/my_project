package com.homework.oop.composition;

public class BankSystem {
    private User[] users = new User[100];
    private int userCount = 0;

    public User createUser(String firstName, String lastName, int age) {
        User user1 = new User(firstName, lastName, age);
        users[userCount++] = user1;
        return user1;
    }

    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Кошти в розмірі: "+amount+" грн були переведені.");
    }

    public void printAllUsers() {
        for (int i = 0; i < userCount; i++) {
            users[i].printAccounts();
        }
    }
}
