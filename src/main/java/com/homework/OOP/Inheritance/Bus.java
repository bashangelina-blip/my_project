package com.homework.OOP.Inheritance;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
    }
    // method overloading
    public void fuelUp(){
        int volume = getTankVolume() - getAvaliablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvaliablePetrol()+petrolVolume;
        if(volume>getTankVolume()){
            setAvaliablePetrol(getTankVolume());

        }
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");

    }

}

