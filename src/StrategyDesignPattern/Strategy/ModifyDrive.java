package StrategyDesignPattern.Strategy;

public class ModifyDrive implements DriveStrategy {
    @Override
    public void Drive() {
        System.out.println("you are in modify drive");
    }
}
