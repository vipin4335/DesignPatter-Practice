package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{

    //this help at the time of object creation to tell what type of drive strategy I want
    PassengerVehicle() {
        super(new NormalDrive());
    }
}
