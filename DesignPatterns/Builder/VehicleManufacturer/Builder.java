package VehicleManufacturer;

public interface Builder {
    Builder setEngine(String engine);
    Builder setNumDoors(int num);
    Builder setNumSeats(int num);
    Builder electric();
    Vehicle build();
}
