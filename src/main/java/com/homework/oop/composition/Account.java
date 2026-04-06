package com.homework.oop.composition;

public class Account {
    private static int nextId = 1;
    private final int accountId;
    protected double balance;

    public Account(double balance) {
        this.accountId = nextId++;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    public void printInfo() {
        System.out.println("Account ID: " + accountId + ", Balance: " + balance);
    }
}
