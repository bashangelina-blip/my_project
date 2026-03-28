package com.homework.OOP.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

    Bus bus = new Bus("Volvo", "VNL 300", EngineType.PATROL, 300, 500, 32);
    bus.start();
    bus.accelerate(30);
    bus.stop();
    bus.fuelUp(300);
    bus.pickUpPassengers(20);
    bus.releasePassengers();


        System.out.println("\n");
        ElectricCar electricCar = new ElectricCar("Tesla", "T120", 100, 5);
        electricCar.charge();
        electricCar.start();
        electricCar.stop();


    }
}
