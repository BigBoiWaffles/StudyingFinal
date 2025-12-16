package VehicleManufacturer;

public abstract class Vehicle {
    private final String engine;
    private final int doors;
    private final int seats;
    private final boolean isElectric;

    public Vehicle(String engine, int doors, int seats, boolean isElectric){
        this.engine = engine;
        this.doors = doors;
        this.seats = seats;
        this.isElectric = isElectric;
    }

    // Getters
    public String getEngine(){ return this.engine; }
    public int getDoors(){ return this.doors; }
    public int getSeats(){ return this.seats; }
    public boolean isElectric(){ return this.isElectric; }
}
