package com.homework.basicConstructions;

public class TaskTwoMethods {
    public static void main(String[] args) {
        sayHello("Mike");
        squareRect(4, 7);
        System.out.println("Square: " + rectSquare(5, 9));

    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    static void squareRect(int x, int y) {
        int square = x * y;
        System.out.println("Rectangle square: " + square);
    }

    static int rectSquare(int x, int y) {
        return x * y;
    }

}
