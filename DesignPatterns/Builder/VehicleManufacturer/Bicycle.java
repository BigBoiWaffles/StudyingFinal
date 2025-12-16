package VehicleManufacturer;

public class Bicycle extends Vehicle{
    public Bicycle(BicycleBuilder builder){
        super("No Engine", 0, builder.numSeats, builder.electric);
    }
}
