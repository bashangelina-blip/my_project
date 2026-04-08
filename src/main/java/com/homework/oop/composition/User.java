package com.homework.oop.composition;

public class User {
    private final long userId;
    private static long nextUserId = 1;
    private String firstName;
    private String lastName;
    private int age;
    private Account[] accounts = new Account[5];
    private int accountCount = 0;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.userId = nextUserId++;

    }

    public long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty())
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty())
            this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=16)
            this.age = age;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = account;
        }
    }

    public Account getAccounts(int index) {
        if(index>=0&& index < accountCount)
            return accounts[index];
        return null;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public void printAccounts() {
        System.out.println("User: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        for (int i = 0; i < accountCount; i++) {
            accounts[i].printInfo();
        }
    }
}
