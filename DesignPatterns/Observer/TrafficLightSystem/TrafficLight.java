package TrafficLightSystem;

import java.util.ArrayList;

public class TrafficLight{
    private LightState state;
    private ArrayList<TrafficObserver> cars;

    public TrafficLight(){
        this.state = null;
        this.cars = new ArrayList<TrafficObserver>();
    }

    public void attach(TrafficObserver observer){
        this.cars.add(observer);
    }

    public void detach(TrafficObserver observer){
        this.cars.remove(observer);
    }

    public void notifyObservers(LightState state){
        this.state = state;
        for(TrafficObserver observer : this.cars){
            observer.update(this.state);
        }
    }
}
