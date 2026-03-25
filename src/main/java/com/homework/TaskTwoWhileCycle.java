package com.homework;

public class TaskTwoWhileCycle {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int payment = 10000;
        int years = 0;
        double interestRate = 0.1;

        do {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + ": " + currentBalance);
        }
        while (currentBalance < finalBalance && years < 15);

    }
}
