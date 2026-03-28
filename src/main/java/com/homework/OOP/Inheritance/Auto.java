package com.homework.OOP.Inheritance;

public class Auto {
    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
    }

    public void start() {
        isRunning = true;
        currentSpeed = 20;
        System.out.println("Car is starting");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Car has stopped");
    }

    public void accelerate(int kmPerHours) {
        currentSpeed += kmPerHours;
        System.out.println("Car is running with speed: " + currentSpeed + " km per hours");
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
