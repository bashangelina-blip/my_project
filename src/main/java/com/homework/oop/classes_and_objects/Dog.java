package com.homework.oop.classes_and_objects;

public class Dog {

    private static int dogsCount;


    public Size getSize() {
        return size;
    }


    public void setSize(Size size) {
        this.size = size;
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }

    }

    public void bark() {
        switch (size) {
            case VERY_BIG:
            case BIG:
                System.out.println("Woof-woof");
                break;
            case AVERAGE:
                System.out.println("Raff-raff");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf-tiaf");
                break;
            default:
                System.out.println("Dog's size is undefined");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count: " + getDogsCount());
    }

    public static int getDogsCount() {
        return dogsCount;
    }

}
