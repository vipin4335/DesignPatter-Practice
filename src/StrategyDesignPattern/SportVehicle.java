package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.ModifyDrive;

public class SportVehicle extends Vehicle{

    SportVehicle() {
        super(new  ModifyDrive());
    }
}
