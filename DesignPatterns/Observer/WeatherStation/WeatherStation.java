package WeatherStation;

import java.util.ArrayList;

public class WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> Observers;

    public WeatherStation(){
        this.Observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        this.Observers.add(o);
    }

    public void removeObserver(Observer o){
        this.Observers.remove(o);
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }

    private void notifyObservers(){
        for(Observer s: Observers){
            s.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
