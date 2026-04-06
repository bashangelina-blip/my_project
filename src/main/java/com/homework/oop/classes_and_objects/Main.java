package com.homework.OOP.ClassesAndObjects;


public class Main {
    public static void main(String[] args) {
        System.out.println("Dogs count: " + Dog.getDogsCount());


        Dog labrador = new Dog();
        labrador.setName("Charlie");
        labrador.setBreed("Labrador");
        labrador.setSize(Size.AVERAGE);
        labrador.bite();


        Dog shepherd = new Dog();
        shepherd.setBreed("Shepherd");
        shepherd.setName("Kali");
        shepherd.setSize(Size.BIG);
        shepherd.bite();

        Dog chihuahua = new Dog();
        chihuahua.setBreed("Chihuhua");
        chihuahua.setName("Lola");
        chihuahua.setSize(Size.SMALL);
        chihuahua.bite();

        Size s = Size.valueOf("BIG");
        Size[] values = Size.values();
        for(int i=0; i < values.length; i++){
            System.out.println(values[i]);
        }


        System.out.println("Lab's name is " + labrador.getName());
        System.out.println("Shepherd's name is " + chihuahua.getName());


    }
}
