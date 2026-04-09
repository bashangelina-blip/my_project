package com.homework.oop.interfacee;

public class Square implements Shapes {

    private final double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
