import Strategy.DriveStrategy;
import Strategy.ModifyDrive;

public class SportVehicle extends Vehicle{

    SportVehicle() {
        super(new  ModifyDrive());
    }
}
