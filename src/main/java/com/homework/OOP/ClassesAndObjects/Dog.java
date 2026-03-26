package com.homework.OOP.ClassesAndObjects;

public class Dog {

    private static int dogsCount;


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average, Small");
        }

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }

    }

    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Woof-woof");
            ;
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raff-raff");
        } else {
            System.out.println("Tiaf-tiaf");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to set " + paws + " paws");
        }

    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to set " + tail + " tails");
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

    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count: " + getDogsCount());
    }

    public static int getDogsCount() {
        return dogsCount;
    }

}
