package com.homework.basicConstructions;

public class TaskTwoForCycle {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int factorial = 1;
        for (int i = 1; i < factorialLimit; i++) {
            factorial *= i;
            System.out.println("Factorial = " + factorial);
        }
        System.out.println("Final factorial value =" + factorial);

    }


}
