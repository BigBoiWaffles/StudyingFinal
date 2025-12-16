package VehicleManufacturer;

public class CarBuilder implements Builder{
    String engine;
    int numDoors;
    int numSeats;
    boolean electric = false;

    @Override
    public CarBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setNumDoors(int num){
        this.numDoors = num;
        return this;
    }

    @Override
    public CarBuilder setNumSeats(int num){
        this.numSeats = num;
        return this;
    }

    @Override
    public CarBuilder electric(){
        this.electric = true;
        return this;
    }

    @Override
    public Car build(){
        return new Car(this);
    }
}
