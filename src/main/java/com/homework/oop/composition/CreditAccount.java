package com.homework.oop.composition;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(double balance) {
        super(balance);
    }

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + creditLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough credit");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Limit: " + creditLimit);
    }
}
