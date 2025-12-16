package VehicleManufacturer;

public class BicycleBuilder implements Builder{
    String engine;
    int numDoors;
    int numSeats;
    boolean electric = false;

    @Override
    public BicycleBuilder setEngine(String engine){
        return this;
    }

    @Override
    public Builder setNumDoors(int num) {
        return this;
    }

    @Override
    public Builder setNumSeats(int num) {
        this.numSeats = num;
        return this;
    }

    @Override
    public Builder electric() {
        this.electric = true;
        return this;
    }

    @Override
    public Bicycle build() {
        return new Bicycle(this);
    }
}
