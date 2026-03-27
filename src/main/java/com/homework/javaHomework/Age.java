package com.homework.javaHomework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Доступ заборонено");

        } else if (age >= 18 && age < 120) {
            System.out.println("Доступ дозволено");
        } else {
            System.out.println("Нічого собі, ви ще живі?");
        }
    }
}
