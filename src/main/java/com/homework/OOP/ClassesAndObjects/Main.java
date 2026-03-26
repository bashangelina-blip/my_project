package com.homework.OOP.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.setPaws(3);

        labrador.setName("Charlie");
        labrador.setBreed("Labrador");

        Dog shepherd = new Dog();
        shepherd.setPaws(4);
        shepherd.setTail(1);
        shepherd.setBreed("Shepherd");
        shepherd.setName("Kali");

        System.out.println("Lab's name is "+labrador.getName());
        System.out.println("Shepherd's name is "+ shepherd.getName());
        System.out.println("Lab's tail is "+labrador.getTail());


    }
}
