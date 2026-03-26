package com.homework.OOP.ClassesAndObjects;

public class Dog {
    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
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
            this.paws = paws;
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
    public String breed;

}
