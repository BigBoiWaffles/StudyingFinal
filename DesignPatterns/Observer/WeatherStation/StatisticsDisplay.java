package WeatherStation;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer{
    private float minTemp;
    private float maxTemp;
    private float avgTemp;
    private ArrayList<Float> allTemp;

    public StatisticsDisplay() {
        this.allTemp = new ArrayList<Float>();
    }

    private float calculateAvgTemp(){
        float totalTemp = 0.0f;
        for(float temp:allTemp){
            totalTemp = totalTemp + temp;
        }
        return avgTemp = totalTemp/this.allTemp.size();
    }

    public String display(){
        return "--------Statistics--------\nMin temperature: " + this.minTemp
                + "\nMax temperature: " + this.maxTemp
                + "\nAvg temperature: " + this.avgTemp;
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        this.allTemp.add(temp);
        this.avgTemp = calculateAvgTemp();

        if (this.minTemp == 0 || this.minTemp > temp){
            this.minTemp = temp;
        }
        if (this.maxTemp == 0 || this.maxTemp < temp){
            this.maxTemp = temp;
        }
    }

}
