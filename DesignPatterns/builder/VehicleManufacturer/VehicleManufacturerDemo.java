package VehicleManufacturer;

public class VehicleManufacturerDemo {
    public static void main(String[] args){
        // Hard-building a electric car
        Car car1 = new CarBuilder()
                .setEngine("No Engine")
                .setNumSeats(4)
                .setNumDoors(4)
                .electric()
                .build();
    }
}
