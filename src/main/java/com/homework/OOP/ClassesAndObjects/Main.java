package com.homework.OOP.ClassesAndObjects;


public class Main {
    public static void main(String[] args) {
        System.out.println("Dogs count: " + Dog.getDogsCount());


        Dog labrador = new Dog();
        labrador.setPaws(4);
        labrador.setName("Charlie");
        labrador.setBreed("Labrador");
        labrador.setSize("Average");
        labrador.bite();


        Dog shepherd = new Dog();
        shepherd.setPaws(4);
        shepherd.setTail(1);
        shepherd.setBreed("Shepherd");
        shepherd.setName("Kali");
        shepherd.setSize("Big");
        shepherd.bite();

        Dog chihuahua = new Dog();
        chihuahua.setPaws(4);
        chihuahua.setTail(1);
        chihuahua.setBreed("Chihuhua");
        chihuahua.setName("Lola");
        chihuahua.setSize("Small");
        chihuahua.bite();



        System.out.println("Lab's name is " + labrador.getName());
        System.out.println("Shepherd's name is " + chihuahua.getName());
        System.out.println("Lab's tail is " + labrador.getTail());




    }
}
