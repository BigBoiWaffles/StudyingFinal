package VehicleManufacturer;

public class Car extends Vehicle{
    public Car(CarBuilder builder){
        super(builder.engine, builder.numDoors, builder.numSeats, builder.electric);
    }
}
