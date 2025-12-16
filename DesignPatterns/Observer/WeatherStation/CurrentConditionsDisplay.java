package WeatherStation;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(){ }

    public String display(){
        return "--------Current Temperature--------\nCurrent temperature: " + this.temperature
                + "\nCurrent humidity: " + this.humidity
                + "\nCurrent pressure: " + this.pressure;
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
