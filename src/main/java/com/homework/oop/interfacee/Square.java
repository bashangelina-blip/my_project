package com.homework.oop.interfacee;

public class Rectangle implements Shapes {

    private double side;

    public Rectangle(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
