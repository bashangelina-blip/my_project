package com.homework.oop.interfacee;

public class main {
    public static void main(String[] args) {

        Shapes triangle = new Triangle(4, 7, 10);
        Shapes square = new Square(20);

        square.describeShape();
        System.out.println("Square has an area: " + square.calculateArea());
        System.out.println("Square has a perimeter: " + square.calculatePerimeter());

        System.out.println();


        System.out.println("Triangle has an area: " + triangle.calculatePerimeter());
        System.out.println("Triangle has a perimeter: " + triangle.calculateArea());

        Shapes.compareAreas(triangle, square);
    }
}
