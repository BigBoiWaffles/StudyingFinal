package VehicleManufacturer;

public class Director {
    public void constructCar(Builder builder){
        builder.setEngine("Ford Engine");
        builder.setNumDoors(4);
        builder.setNumSeats(6);
    }

    public void constructBicycle(Builder builder){
        builder.setNumSeats(1);
    }
}
