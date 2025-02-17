package StrategyDesignPattern.Strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.println("you are in Normal Drive");
    }
}
