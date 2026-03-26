package com.homework.basicConstructions;

public class TaskTwoStrings {
    public static void main(String[] args) {
        sayHello("Mike");
        squareRect(4, 7);
        System.out.println("Square: " + rectSquare(5, 9));


        String str1 = "I like coffee";
        String str2 = "I like coffee!!!";
        String substring = str2.substring(0,13);
        String str3 = new String("I like coffee");

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1 == substring);
        System.out.println(str1.equals(str3));

        System.out.println(str1.startsWith("I like"));
        System.out.println(str1.startsWith(" like", 1));
        System.out.println(str1.endsWith("fee!"));
        System.out.println(str1.replace("coffee", "juice"));
        System.out.println(str1.indexOf("k"));

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
