package com.homework.oop.interfacee;

public interface Shapes {
    // абстрактні методи інтерфейсу
    double calculateArea();

    double calculatePerimeter();

    // дефолтний реалізований метод, тільки для інтерфейсу
    default void describeShape() {
        System.out.println("There are four main shapes");
    }

    // статичний реалізований метод, викликається через інтерфейс
    static void compareAreas(Shapes shape1, Shapes shape2) {
        double shapeArea1 = shape1.calculateArea();
        double shapeArea2 = shape2.calculateArea();

        if (shapeArea1 > shapeArea2) {
            System.out.println(shape1.getClass().getSimpleName() + " has greater area");
        } else if (shapeArea2 > shapeArea1) {
            System.out.println(shape2.getClass().getSimpleName() + " has greater area");
        } else {
            System.out.println("Shapes have equal areas");
        }
    }
}
