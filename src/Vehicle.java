import Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveObj)
    {
        this.driveStrategy=driveObj;
    }
    public void Drive()
    {
         driveStrategy.Drive();
    }
   public  void tyre()
    {
        System.out.println("vehicle tyre");
    }
}
